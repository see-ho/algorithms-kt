fun main(){
    val (n, m) = readln().split(" ").map { it.toInt() }

    val graph = Array<MutableList<Int>>(n+1){ mutableListOf() }

    repeat(m){
        val (ai, bi) = readln().split(" ").map { it.toInt() }
        graph[ai].add(bi)
        graph[bi].add(ai)
    }

    val visited = Array(n+1){ -1 }
    val queue = ArrayDeque<Int>()

    visited[1] = 0
    queue.add(1)

    while(queue.isNotEmpty()){
        val curr = queue.removeFirst()

        for (next in graph[curr]) {
            if(visited[next] == -1){
                visited[next]= visited[curr] + 1
                queue.add(next)
            }
        }
    }


    val max = visited.max()
    val minIndex = visited.indexOf(max)
    val count = visited.count { it == max }

    println("$minIndex $max $count")
}
