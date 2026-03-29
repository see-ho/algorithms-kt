import kotlin.math.sqrt

class Solution {
        fun solution(numbers: String): Int {
        var answer = 0
        val result = mutableSetOf<Int>()
        val visited = BooleanArray(numbers.length)

        fun makeNum(curr: String) {
            if (curr.isNotEmpty()) {
                result.add(curr.toInt())
            }

            for (i in numbers.indices) {
                if (!visited[i]) {
                    visited[i] = true
                    makeNum(curr + numbers[i])
                    visited[i] = false
                }
            }
        }

        makeNum("")

        result.forEach { if (isPrime(it)) answer++ }

        return answer
    }

    fun isPrime(n: Int): Boolean {
        if (n < 2) return false
        for (i in 2..sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) return false
        }
        return true
    }
}
