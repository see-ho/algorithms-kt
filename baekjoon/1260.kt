fun main(){
    val br = System.`in`.bufferedReader()
    val (n,m,v) = br.readLine().split(" ").map { it.toInt() }
    val graph = Array(n+1){ ArrayList<Int>() }
    repeat(m){
        val (a,b) = br.readLine().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }
    repeat(n){
        graph[it+1].sort()
    }
    val visitedDfs = BooleanArray(n+1){false}
    val visitedBfs = BooleanArray(n+1){false}
    dfs(v,graph,visitedDfs)
    println()
    bfs(v,graph,visitedBfs)

}

fun dfs(v:Int, graph:Array<ArrayList<Int>>,visited:BooleanArray){
    visited[v] = true
    print("$v ")
    for(i in graph[v]){
        if(!visited[i]) {
            dfs(i,graph,visited)
        }
    }
}
fun bfs(v:Int, graph:Array<ArrayList<Int>>,visited:BooleanArray){
    val queue = ArrayDeque<Int>()
    queue.add(v)
    visited[v] = true
    print("$v ")
    while(queue.isNotEmpty()){
        graph[queue.removeFirst()].forEach {
            if(!visited[it]){
                queue.add(it)
                visited[it] = true
                print("$it ")
            }
        }
    }
}