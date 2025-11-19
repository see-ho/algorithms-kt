fun main() {
    val (f, s, g, u, d) = readln().split(" ").map { it.toInt() }

    val visited = IntArray(f + 1) { -1 }
    val queue = ArrayDeque<Int>()

    visited[s] = 0
    queue.add(s)

    while (queue.isNotEmpty()) {
        val curr = queue.removeFirst()

        if (curr == g) break

        val up = curr + u
        val down = curr - d

        if (up <= f && visited[up] == -1) {
            visited[up] = visited[curr] + 1
            queue.add(up)
        }


        if (down >= 1 && visited[down] == -1) {
            visited[down] = visited[curr] + 1
            queue.add(down)
        }
    }

    println(if (visited[g] != -1) visited[g] else "use the stairs")
}
