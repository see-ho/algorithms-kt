var cnt = 0
fun main(){
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val graph = Array(n+1){ ArrayList<Int>() }
    repeat(br.readLine().toInt()){
        val (a,b) = br.readLine().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }

    val visitedDfs = BooleanArray(n+1){false}
    dfs(1,graph,visitedDfs)
    println(cnt-1)
}

fun dfs(v:Int, graph:Array<ArrayList<Int>>,visited:BooleanArray){
    visited[v] = true
    cnt++
    for(i in graph[v]){
        if(!visited[i]) {
            dfs(i,graph,visited)
        }
    }
}