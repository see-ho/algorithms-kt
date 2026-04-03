class Solution {
    fun solution(n: Int, edge: Array<IntArray>): Int {
        val graph = Array(n + 1) { ArrayList<Int>() }
        for ((a, b) in edge) {
            graph[a].add(b)
            graph[b].add(a)
        }

        val distance = IntArray(n + 1) { -1 }
        val queue = ArrayDeque<Int>()
        queue.add(1)
        distance[1] = 0

        while(queue.isNotEmpty()) {
            val now = queue.removeFirst()
            for(next in graph[now]) {
                if(distance[next] == -1) {
                    distance[next] = distance[now] + 1
                    queue.add(next)
                }
            }
        }

        val maxDist = distance.maxOrNull()!!
        return distance.count { it == maxDist }
    }
}
