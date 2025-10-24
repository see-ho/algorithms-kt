/**
 * 2023
 * - 전역 변수 cnt 사용
 * - BufferedReader 사용으로 빠른 입출력
 */

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

/**
 * 2025.10.24 
 * - 전역 변수 제거 → 함수 반환값 구조로 개선
 * - readln 사용
 */

 fun main(){
    val n = readln().toInt()
    val graph = Array(n+1){ArrayList<Int>()}
    val visited = BooleanArray(n+1){false}

    repeat(readln().toInt()){
        val (a,b) = readln().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }

    fun dfs(now: Int, visited: BooleanArray): Int{
        visited[now] = true
        var count = 1
 
        for(i in graph[now]){
            if(!visited[i]) count += dfs(i,visited)
        }
        return count
    }    
    print(dfs(1 ,visited) - 1)
}
