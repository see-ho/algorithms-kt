import java.util.*
import kotlin.collections.ArrayDeque

class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        val queue = ArrayDeque<Pair<Int, Int>>()
        val pq = PriorityQueue<Int>(Collections.reverseOrder())

        priorities.forEachIndexed { index, i ->
            queue.add(i to index)
            pq.add(i)
        }

        var answer = 0

        while (queue.isNotEmpty()) {
            val front = queue.removeFirst()

            if (front.first == pq.peek()) {
                answer++
                pq.poll()

                if (front.second == location) return answer
            } else {
                queue.add(front)
            }
        }
        return answer
    }
}
