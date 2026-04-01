class Solution {
    fun solution(begin: String, target: String, words: Array<String>): Int {
        val visited = BooleanArray(words.size)
        var answer = Int.MAX_VALUE

        fun canChange(a: String, b: String): Boolean {
            var diff = 0

            for (i in a.indices) {
                if (a[i] != b[i]) diff++
            }

            return diff == 1
        }

        fun dfs(curr: String, count: Int) {
            if (curr == target) {
                answer = minOf(answer, count)
                return
            }

            for (i in words.indices) {
                if (!visited[i] && canChange(curr, words[i])) {
                    visited[i] = true
                    dfs(words[i], count + 1)
                    visited[i] = false
                }
            }
        }

        dfs(begin, 0)

        return if (answer == Int.MAX_VALUE) 0 else answer
    }
}
