fun main(){
    val n = readln().toInt()
    val arr  = readln().split(" ").map { it.toInt() }.sorted()
    var cnt = 0
    repeat(n){
        for (j in 0..it){
            cnt += arr[j]
        }
    }
    println(cnt)
}