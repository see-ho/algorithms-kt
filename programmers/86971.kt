import kotlin.math.abs

class Solution {
     fun solution(n: Int, wires: Array<IntArray>): Int {
        val graph = Array(n + 1) { ArrayList<Int>() }

        wires.forEach {
            val (n1, n2) = it
            graph[n1].add(n2)
            graph[n2].add(n1)
        }

        var min = n

        wires.forEach {
            val cutA = it[0]
            val cutB = it[1]

            val visited = BooleanArray(n + 1) { false }

            val count = dfs(1, cutA, cutB, visited, graph)

            val diff = abs(count - (n - count))
            if (diff < min) min = diff

        }
        
        return min

    }

    fun dfs(curr: Int, cutA: Int, cutB: Int, visited: BooleanArray, graph: Array<ArrayList<Int>>): Int {
        var count = 1
        visited[curr] = true

        for (next in graph[curr]) {
            if (!visited[next] && !(curr == cutA && next == cutB) && !(curr == cutB && next == cutA))
                count += dfs(next, cutA, cutB, visited, graph)
        }

        return count
    }
}
