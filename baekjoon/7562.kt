fun main() {
    val t = readln().toInt()

    repeat(t) {
        val n = readln().toInt()
        val (sy, sx) = readln().split(" ").map { it.toInt() }
        val (ty, tx) = readln().split(" ").map { it.toInt() }

        println(bfs(n, sy, sx, ty, tx))
    }
}

fun bfs(n: Int, sy: Int, sx: Int, ty: Int, tx: Int): Int {
    val visited = Array(n) { IntArray(n) { -1 } }

    val dy = intArrayOf(-2, -2, -1, -1, 1, 1, 2, 2)
    val dx = intArrayOf(-1, 1, -2, 2, -2, 2, -1, 1)

    val queue = ArrayDeque<Pair<Int, Int>>()
    queue.add(sy to sx)
    visited[sy][sx] = 0

    while (queue.isNotEmpty()) {
        val (y, x) = queue.removeFirst()

        if (y == ty && x == tx) return visited[y][x]

        for (d in 0 until 8) {
            val ny = y + dy[d]
            val nx = x + dx[d]

            if (ny !in 0 until n || nx !in 0 until n) continue
            if (visited[ny][nx] != -1) continue

            visited[ny][nx] = visited[y][x] + 1
            queue.add(ny to nx)
        }
    }
    return -1
}
