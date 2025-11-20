class Solution {
    fun solution(n: Int, w: Int, num: Int): Int {
        var boxes = Array(w) { ArrayDeque<Int>() }

        var box = 1
        var line = 0

        while (box <= n) {
            for (i in 0 until w) {
                if (box > n) break
                if (line % 2 == 0) {
                    boxes[i].add(box++)
                } else {
                    boxes[w - 1 - i].add(box++)
                }
            }
            line++
        }

        val target = boxes.find { it.contains(num) }

        return target!!.size - target.indexOf(num)
    }
}
