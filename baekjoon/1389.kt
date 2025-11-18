fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    val graph = Array<MutableList<Int>>(n + 1) { mutableListOf() }

    repeat(m) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }

    val bacon = Array(n + 1) { 0 }

    for (person in 1..n) {
        val visited = Array(n + 1) { -1 }
        val queue = ArrayDeque<Int>()

        visited[person] = 0
        queue.add(person)

        while (queue.isNotEmpty()) {
            val curr = queue.removeFirst()

            for (next in graph[curr]) {
                if (visited[next] == -1) {
                    visited[next] = visited[curr] + 1
                    queue.add(next)
                }
            }
        }

        bacon[person] = visited.drop(1).sum()
    }

    println(bacon.indexOf(bacon.drop(1).min()))
}
