import java.util.PriorityQueue
import java.util.Collections

class Solution {
     fun solution(operations: Array<String>): IntArray {
        val minPq = PriorityQueue<Int>()
        val maxPq = PriorityQueue<Int>(Collections.reverseOrder())

        operations.forEach { 
            val command = it.split(" ")
            val action = command[0]
            val value = command[1].toInt()

            when (action) {
                "I" -> {
                    minPq.add(value)
                    maxPq.add(value)
                }
                "D" -> {
                    if (value == 1) {
                        val max = maxPq.poll()
                        minPq.remove(max)
                    } else {
                        val min = minPq.poll()
                        maxPq.remove(min)
                    }
                }
            }
        }

        if (minPq.isEmpty()) return intArrayOf(0, 0)
        return intArrayOf(maxPq.peek(), minPq.peek())
    }
}
