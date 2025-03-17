import kotlin.math.pow

fun main(){
    val arr = readln().split(" ").map { it.toDouble().pow(2) }
    var sum = 0
    for(a in arr)
        sum += a.toInt()
    println(sum%10)
}