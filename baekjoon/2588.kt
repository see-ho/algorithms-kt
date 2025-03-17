import java.util.*

fun main() = with(Scanner(System.`in`)){
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    println(a*(b%10));
    println(a*(b%100/10));
    println(a*(b/100));
    println(a*b)
}