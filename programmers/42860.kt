class Solution {
    fun solution(name: String): Int {
        var answer = 0

        for (c in name) {
            val up = c - 'A'
            val down = 26 - (c - 'A')
            answer += minOf(up, down)
        }

        var leftRight = name.length - 1

        for (i in name.indices) {
            var next = i + 1

            while (next < name.length && name[next] == 'A') {
                next++
            }

            leftRight = minOf(
                leftRight,
                i * 2 + (name.length - next),
                (name.length - next) * 2 + i
            )

        }

        return answer + leftRight
    }
}
