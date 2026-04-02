class Solution {
    fun solution(n: Int, times: IntArray): Long {
        var answer: Long = 0
        var min = 1L
        var max: Long = n * times.maxOf { it }.toLong()

        while (min <= max) {
            val mid = (min + max) / 2
            val sum = times.sumOf { mid / it }

            if (sum >= n) {
                answer = mid
                max = mid - 1
            } else {
                min = mid + 1
            }
        }

        return answer
    }
}
