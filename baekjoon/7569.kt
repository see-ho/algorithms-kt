fun main(){
    val (m, n, h) = readln().split(" ").map { it.toInt() }
    val graph = Array(h){Array(n){ readln().split(" ").map { it.toInt() }.toIntArray() }}
    val directions = listOf(
        Triple(1, 0, 0), Triple(-1, 0, 0),
        Triple(0, 1, 0), Triple(0, -1, 0),
        Triple(0, 0, 1), Triple(0, 0, -1)
    )
    val queue = ArrayDeque<Triple<Int,Int,Int>>()
    var days = 0

    for(i in 0 until h){
        for(j in 0 until n){
            for(k in 0 until m){
                if(graph[i][j][k] == 1)
                    queue.add(Triple(i,j,k))
            }
        }
    }

    while(queue.isNotEmpty()) {
        repeat(queue.size) {
            val (z, x, y) = queue.removeFirst()
            for ((dz, dx, dy) in directions) {
                val nx = x + dx
                val ny = y + dy
                val nz = z + dz
                if (nz in 0 until h && nx in 0 until n && ny in 0 until m && graph[nz][nx][ny] == 0) {
                    graph[nz][nx][ny] = 1
                    queue.add(Triple(nz,nx,ny))
                }
            }
        }
        days++
    }

    if (graph.any { layer -> layer.any { tomatoes -> tomatoes.any { it == 0 } } }) println(-1)
    else println(days-1)
}
