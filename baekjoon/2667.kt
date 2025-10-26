fun main(){
    val n = readln().toInt()
    val graph = Array(n){ readln().map { it.digitToInt() }.toIntArray() }
    val visited = Array(n){BooleanArray(n){false}}
    val answer = mutableListOf<Int>()


    fun bfs(i: Int, j:Int ): Int {
        var cnt = 1
        val queue = ArrayDeque<Pair<Int,Int>>()
        queue.add(i to j)
        visited[i][j] = true

        val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

        while(queue.isNotEmpty()) {
            val (x, y) = queue.removeFirst()
            for ((dx, dy) in directions) {
                val nx = x + dx
                val ny = y + dy
                if (nx in 0 until n && ny in 0 until n && graph[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true
                    cnt++
                    queue.add(nx to ny)
                }
            }
        }
        return cnt
    }

    for( i in 0 until n){
        for(j in 0 until n){
            if(graph[i][j] == 1 && !visited[i][j])
                answer.add(bfs(i,j))
        }
    }

    println(answer.size)
    answer.sorted().forEach { println(it) }
}
