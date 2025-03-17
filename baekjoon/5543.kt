import kotlin.math.min

fun main(){
    var a = readln().toInt()
    repeat(2){ a = min(a,readln().toInt()) }
    var b = readln().toInt()
    b = min(b,readln().toInt())
    println(a+b-50)
}