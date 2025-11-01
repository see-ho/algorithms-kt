fun main(){
    val (n, m) = readln().split(" ").map { it.toInt() }
    val graph = Array(n){ readln().split(" ").map { it.toInt() }.toIntArray() }

    val k = readln().toInt()
    repeat(k){
        val (i,j,x,y) = readln().split(" ").map { it.toInt() }
        var answer = 0
        for(a in i-1..<x){
            for(b in j-1..<y){
                answer += graph[a][b]
            }
        }
        println(answer)
    }
}
