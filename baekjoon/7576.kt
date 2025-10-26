fun main(){
    val (m, n) = readln().split(" ").map { it.toInt() }
    val graph = Array(n){ readln().split(" ").map { it.toInt() }.toIntArray() }
    val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)
    val queue = ArrayDeque<Pair<Int,Int>>()
    var days = 0

    for(i in 0 until n){
        for(j in 0 until m){
            if(graph[i][j] == 1)
                queue.add(i to j)
        }
    }

    while(queue.isNotEmpty()) {
        repeat(queue.size) {
            val (x, y) = queue.removeFirst()
            for ((dx, dy) in directions) {
                val nx = x + dx
                val ny = y + dy
                if (nx in 0 until n && ny in 0 until m && graph[nx][ny] == 0) {
                    graph[nx][ny] = 1
                    queue.add(nx to ny)
                }
            }
        }
        days++
    }

    if (graph.any { tomatoes -> tomatoes.any{ it == 0}}) println(-1)
    else println(days-1)
}
