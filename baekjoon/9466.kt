fun main(){
    val t = readln().toInt()
    repeat(t){
        val n = readln().toInt()
        val student = readln().split(" ").map { it.toInt() - 1}
        val visited = BooleanArray(n){false}
        val team = mutableListOf<Int>()
        var answer = n

        fun dfs( index: Int): Int {
            visited[index] = true
            team.add(index)
            val next = student[index]

            if (!visited[next]) return dfs(next)
            else if (team.contains(next)) {
                val teamSize = team.size - team.indexOf(next)
                return teamSize
            }

            return 0
        }

        for (i in 0 until n) {
            if (!visited[i]) {
                team.clear()
                val result = dfs(i)
                answer -= result
            }
        }
        println(answer)
    }
}
