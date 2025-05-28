fun main(){
    val (n,m) = readln().split(" ").map { it.toInt() }
    val visited = BooleanArray(n+1){false}
    val printArr = IntArray(m)

    for(i in 1..n){
        backtrack(i,visited,printArr,0,n,m)
    }
}

fun backtrack(current: Int, visited: BooleanArray, printArr: IntArray, depth: Int, n:Int, m:Int){
    visited[current] = true
    printArr[depth] = current

    if(depth+1 == m){
        println(printArr.joinToString(" "))
        visited[current] = false
        return
    }

    for (i in 1..n) {
        if (!visited[i]) {
            backtrack(i, visited, printArr,depth+1,n,m)
        }
    }
    visited[current] = false
}
