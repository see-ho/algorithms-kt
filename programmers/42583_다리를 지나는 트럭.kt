import java.util.ArrayDeque

class Solution1 {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var time = 0
        var curr = 0
        val truckQueue = ArrayDeque<Int>()
        truck_weights.forEach { truckQueue.add(it) }

        val bridge = ArrayDeque<Int>()
        repeat(bridge_length) { bridge.add(0) }

        while (bridge.isNotEmpty()) {
            time++

            val out = bridge.removeFirst()
            curr -= out

            if (truckQueue.isNotEmpty()) {
                if (curr + truckQueue.peek() <= weight) {
                    val nextTruck = truckQueue.poll()
                    bridge.addLast(nextTruck)
                    curr += nextTruck
                } else {
                    bridge.addLast(0)
                }
            }
        }

        return time
    }
}
