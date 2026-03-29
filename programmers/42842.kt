import kotlin.math.sqrt

class Solution {
     fun solution(brown: Int, yellow: Int): IntArray {
        var w = 0
        var h = 0
        val area = brown + yellow
        for (i in 2..sqrt(area.toDouble()).toInt()) {
            w = area / i
            h = i
            if ((w - 2) * (h - 2) == yellow) break
        }

        return intArrayOf(w, h)
    }
}
