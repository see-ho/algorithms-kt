fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val map = Array(n) { readln().toCharArray() }

    val dy = intArrayOf(-1, 1, 0, 0)
    val dx = intArrayOf(0, 0, -1, 1)

    var answer = 0

    fun bfs(sy: Int, sx: Int) {
        val visited = Array(n) { BooleanArray(m) }
        val queue = ArrayDeque<Triple<Int, Int, Int>>()

        queue.add(Triple(sy, sx, 0))
        visited[sy][sx] = true

        var max = 0

        while (queue.isNotEmpty()) {
            val (y, x, d) = queue.removeFirst()
            max = maxOf(max, d)

            for (i in 0 until 4) {
                val ny = y + dy[i]
                val nx = x + dx[i]

                if (ny !in 0 until n || nx !in 0 until m) continue
                if (visited[ny][nx] || map[ny][nx] == 'W') continue

                visited[ny][nx] = true
                queue.add(Triple(ny, nx, d + 1))
            }
        }

        answer = maxOf(answer, max)
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (map[i][j] == 'L') {
                bfs(i, j)
            }
        }
    }

    print(answer)
}
