class Solution {
    fun solution(tickets: Array<Array<String>>): Array<String> {
        val visited = BooleanArray(tickets.size)
        val routes = mutableListOf<String>()

        fun dfs(curr: String, path: MutableList<String>) {
            if (path.size == tickets.size + 1) {
                routes.add(path.joinToString(" "))
                return
            }

            for (i in tickets.indices) {
                if (!visited[i] && tickets[i][0] == curr) {
                    visited[i] = true
                    path.add(tickets[i][1])

                    dfs(tickets[i][1], path)

                    path.removeAt(path.lastIndex)
                    visited[i] = false
                }
            }
        }

        dfs("ICN", mutableListOf("ICN"))

        return routes.sorted()[0].split(" ").toTypedArray()
    }
}
