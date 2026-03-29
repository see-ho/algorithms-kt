class Solution {
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        var visited = BooleanArray(dungeons.size)

        var max = 0
        
        fun backtracking(curr: Int, count: Int) {
            if (count >= max) max = count

            for (i in dungeons.indices) {
                if (!visited[i] && curr >= dungeons[i][0]) {
                    visited[i] = true
                    backtracking(curr - dungeons[i][1], count + 1)
                    visited[i] = false
                }
            }
        }

        backtracking(k, max)

        return max
    }
}
