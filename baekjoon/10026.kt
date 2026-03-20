fun main() {
    val n = readln().toInt()
    val grid = Array(n) { readln().toCharArray() }
    val forRedOrGreen = Array(n) { grid[it].copyOf() }

    var redGreen = 0
    var realSpace = 0

    val dy = listOf(-1, 1, 0, 0)
    val dx = listOf(0, 0, 1, -1)

    val queue = ArrayDeque<Pair<Int, Int>>()

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (grid[i][j] != 'V') {
                val color = grid[i][j]
                queue.add(i to j)
                grid[i][j] = 'V'

                while (queue.isNotEmpty()) {
                    val (y, x) = queue.removeFirst()

                    for (d in 0 until 4) {
                        val ny = y + dy[d]
                        val nx = x + dx[d]

                        if (ny in 0 until n && nx in 0 until n && grid[ny][nx] == color) {
                            grid[ny][nx] = 'V'
                            queue.add(ny to nx)
                        }
                    }
                }
                realSpace++
            }
        }
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (forRedOrGreen[i][j] != 'V') {
                val color = forRedOrGreen[i][j]
                val isRedOrGreen = color == 'R' || color == 'G'
                queue.add(i to j)
                forRedOrGreen[i][j] = 'V'

                while (queue.isNotEmpty()) {
                    val (y, x) = queue.removeFirst()

                    for (d in 0 until 4) {
                        val ny = y + dy[d]
                        val nx = x + dx[d]

                        if (ny in 0 until n && nx in 0 until n) {
                            val nextColor = forRedOrGreen[ny][nx]

                            val isSameColor = nextColor == color
                            val isRGArea = isRedOrGreen && (nextColor == 'R' || nextColor == 'G')

                            if (isSameColor || isRGArea) {
                                forRedOrGreen[ny][nx] = 'V'
                                queue.add(ny to nx)
                            }
                        }
                    }
                }
                redGreen++
            }
        }
    }

    print("$realSpace $redGreen")
}
