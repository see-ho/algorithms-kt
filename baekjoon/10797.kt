fun main(){
    val num = readln().toInt()
    var cnt = 0
    val arr = readln().split(" ").map { if(it.toInt()==num) cnt++ }
    println(cnt)
}