fun main() {
    val n = readln().toInt()
    val map = Array(n) {
        readln().map { it - '0' }.toIntArray()
    }

    val dy = intArrayOf(-1, 1, 0, 0)
    val dx = intArrayOf(0, 0, -1, 1)

    val queue = ArrayDeque<Pair<Int, Int>>()
    val houses = arrayListOf<Int>()
    var house = 0

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (map[i][j] == 1) {
                house = 0
                queue.add(i to j)
                map[i][j] = -1

                while (queue.isNotEmpty()) {
                    val (y, x) = queue.removeFirst()
                    house++

                    for (d in 0 until 4) {
                        val ny = y + dy[d]
                        val nx = x + dx[d]

                        if (ny in 0 until n && nx in 0 until n && map[ny][nx] == 1) {
                            map[ny][nx] = -1
                            queue.add(ny to nx)
                        }
                    }
                }
                houses.add(house)
            }
        }
    }

    println(houses.size)
    houses.sorted().forEach { println(it) }
}
