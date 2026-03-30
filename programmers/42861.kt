class Solution {
    fun solution(n: Int, costs: Array<IntArray>): Int {
        var answer = 0
        val sortedCosts = costs.sortedBy { it[2] }

        val parent = IntArray(n) { it }

        fun find(x: Int): Int {
            if (parent[x] != x) parent[x] = find(parent[x])
            return parent[x]
        }

        fun union(x: Int, y: Int) {
            val px = find(x)
            val py = find(y)
            if (px != py) parent[px] = py
        }

        for (c in sortedCosts) {
            if (find(c[0]) != find(c[1])) { 
                union(c[0], c[1])
                answer += c[2]
            }
        }

        return answer
    }
}
