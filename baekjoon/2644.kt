fun main(){
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val graph = Array(n+1){ ArrayList<Int>() }
    val (a,b) = br.readLine().split(" ").map { it.toInt() }
    val result = mutableListOf<Int>(-1)
    repeat(br.readLine().toInt()){
        val (n1,n2) = br.readLine().split(" ").map { it.toInt() }
        graph[n1].add(n2)
        graph[n2].add(n1)
    }

    val visited = BooleanArray(n+1){false}

    dfs(a,b,0,graph,visited,result)

    println(result[0])
}

fun dfs(v:Int, t:Int, cnt:Int, graph:Array<ArrayList<Int>>,visited:BooleanArray,result:MutableList<Int>){
    visited[v] = true
    if(v==t) result[0] = cnt
    for(i in graph[v]){
        if(!visited[i]) {
            dfs(i,t,cnt+1,graph,visited,result)
        }
    }
}
