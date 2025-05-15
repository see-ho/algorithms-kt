import java.util.PriorityQueue

class Solution {
    fun solution(N: Int, road: Array<IntArray>, K: Int): Int {
        val graph = Array(N + 1) { mutableListOf<Pair<Int, Int>>() }
        val distances = IntArray(N + 1) { Int.MAX_VALUE }
        val pq = PriorityQueue(compareBy<Pair<Int, Int>> { it.second })

        distances[1] = 0
        pq.add(Pair(1, 0))

        for ((a, b, c) in road) {
            graph[a].add(Pair(b, c))
            graph[b].add(Pair(a, c))
        }

        while (pq.isNotEmpty()) {
            val (now, dist) = pq.poll()
            if (dist > distances[now]) continue

            for ((next, weight) in graph[now]) {
                val newDist = dist + weight
                if (newDist < distances[next]) {
                    distances[next] = newDist
                    pq.add(Pair(next, newDist))
                }
            }
        }

        return distances.count { it <= K }
    }
}
