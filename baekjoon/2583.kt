fun main(){
    val (m, n, k) = readln().split(" ").map { it.toInt() }
    val graph = Array(m){ Array(n){0} }
    val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)
    val squares = Array(k){ readln().split(" ").map { it.toInt() }.toIntArray() }
    val queue = ArrayDeque<Pair<Int,Int>>()
    val areas = mutableListOf<Int>()

    squares.forEach {
        for (x in it[1] until it[3]) {
            for (y in it[0] until it[2]) {
                graph[x][y] = 1
            }
        }
    }

    fun bfs(){
        var area = 0
        while(queue.isNotEmpty()) {
            val (x, y) = queue.removeFirst()
            for ((dx, dy) in directions) {
                val nx = x + dx
                val ny = y + dy
                if (nx in 0 until m && ny in 0 until n && graph[nx][ny] == 0) {
                    graph[nx][ny] = 1
                    area++
                    queue.add(nx to ny)
                }
            }
        }
        areas.add(if(area == 0) 1 else area)
    }


    for(i in 0 until m){
        for(j in 0 until n){
            if(graph[i][j] == 0) {
                queue.add(i to j)
                bfs()
            }
        }
    }



    println(areas.size)
    areas.sorted().forEach { print("$it ") }
}
