fun main() {
    val (m, n, k) = readln().split(" ").map { it.toInt() }
    val map = Array(m) { IntArray(n) { 0 } }

    repeat(k) {
        val (x1, y1, x2, y2) = readln().split(" ").map { it.toInt() }
        for (i in y1 until y2) {
            for (j in x1 until x2) {
                map[i][j] = 1
            }
        }
    }

    val dy = intArrayOf(-1, 1, 0, 0)
    val dx = intArrayOf(0, 0, -1, 1)

    val queue = ArrayDeque<Pair<Int, Int>>()
    val emptyList = arrayListOf<Int>()
    var emptySpace = 0

    for (i in 0 until m) {
        for (j in 0 until n) {
            if (map[i][j] == 0) {
                emptySpace = 0
                queue.add(i to j)
                map[i][j] = -1

                while (queue.isNotEmpty()) {
                    val (y, x) = queue.removeFirst()
                    emptySpace++

                    for (d in 0 until 4) {
                        val ny = y + dy[d]
                        val nx = x + dx[d]

                        if (ny in 0 until m && nx in 0 until n && map[ny][nx] == 0) {
                            map[ny][nx] = -1
                            queue.add(ny to nx)
                        }
                    }
                }
                emptyList.add(emptySpace)
            }
        }
    }

    println(emptyList.size)
    emptyList.sorted().forEach { print("$it ") }
}
