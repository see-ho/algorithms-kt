fun main(){
    val (n, m) = readln().split(" ").map { it.toInt() }
    val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)
    val graph = Array(n){ readln().split(" ").map { it.toInt() }.toIntArray() }
    val queue = ArrayDeque<Pair<Int,Int>>()
    val areas = mutableListOf<Int>()

    fun bfs(i: Int, j: Int){
        queue.add(i to j)
        graph[i][j] = -1
        var area = 1

        while(queue.isNotEmpty()) {
            val (x, y) = queue.removeFirst()
            for ((dx, dy) in directions) {
                val nx = x + dx
                val ny = y + dy
                if (nx in 0 until n && ny in 0 until m && graph[nx][ny] == 1) {
                    graph[nx][ny] = -1
                    area++
                    queue.add(nx to ny)
                }
            }
        }
        areas.add(area)
    }


    for(i in 0 until n){
        for(j in 0 until m){
            if(graph[i][j] == 1) {
                bfs(i, j)
            }
        }
    }
    println(areas.size)
    println(if(areas.isNotEmpty())areas.max() else 0)
}
