class Solution {
    fun solution(n: Int, computers: Array<IntArray>): Int {
        val visited = BooleanArray(n)
        var answer = 0

        fun dfs(now: Int) {
            visited[now] = true

            for (next in 0 until n) {
                if (!visited[next] && computers[now][next] == 1) {
                    dfs(next)
                }
            }
        }

        for (i in 0 until n) {
            if (!visited[i]) {
                dfs(i)
                answer++
            }
        }

        return answer
    }
}
