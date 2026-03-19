fun main() {
    val t = readln().toInt()

    repeat(t) {
        val (m, n, k) = readln().split(" ").map { it.toInt() }
        val field = Array(n) { Array(m) { 0 } }

        var answer = 0
        repeat(k) {
            val (x, y) = readln().split(" ").map { it.toInt() }
            field[y][x] = 1
        }

        val dy = intArrayOf(-1, 1, 0, 0)
        val dx = intArrayOf(0, 0, -1, 1)

        val stack = ArrayDeque<Pair<Int, Int>>()

        for (i in 0 until n) {
            for (j in 0 until m) {
                if (field[i][j] == 1) {
                    answer++
                    stack.add(i to j)

                    field[i][j] = -1

                    while (stack.isNotEmpty()) {
                        val (y, x) = stack.removeLast()

                        for (d in 0 until 4) {
                            val ny = y + dy[d]
                            val nx = x + dx[d]

                            if (ny in 0 until n && nx in 0 until m && field[ny][nx] == 1) {
                                field[ny][nx] = -1
                                stack.add(ny to nx)
                            }
                        }
                    }
                }
            }
        }
        println(answer)
    }
}
