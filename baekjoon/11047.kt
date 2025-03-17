fun main(){
    var (n,k) = readln().split(" ").map { it.toInt() }
    val arr = IntArray(n){ readln().toInt()}
    var cnt = 0

    arr.reversed().forEach {
        cnt += k/it
        k %= it
    }
    println(cnt)
}