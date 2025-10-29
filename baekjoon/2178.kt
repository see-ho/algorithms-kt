fun main(){
    val (n, m) = readln().split(" ").map { it.toInt() }
    val graph = Array(n){ readln().map { it.digitToInt() }.toIntArray() }
    val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)
    val queue = ArrayDeque<Pair<Int, Int>>()
    val distance = Array(n) { IntArray(m) { 0 } }


    queue.add(0 to 0)
    distance[0][0] = 1

    while (queue.isNotEmpty()) {
        val (x,y) = queue.removeFirst()

        for ((dx, dy) in directions) {
            val nx = x + dx
            val ny = y + dy

            if(nx in 0 until n && ny in 0 until m && graph[nx][ny] == 1 && distance[nx][ny] == 0) {
                distance[nx][ny] = distance[x][y] + 1
                queue.add(nx to ny)
            }
        }
    }

    println(distance[n-1][m-1])
}
