class Solution {
    fun solution(citations: IntArray): Int {
        citations.sort()

        val n = citations.size

        for (i in citations.indices) {
            val h = n - i
            if (citations[i] >= h) return h
        }

        return 0
    }
}
