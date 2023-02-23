import java.lang.Math.abs

fun main(){
    val (a,b,c,d) = readln().split(" ").map { it.toInt() }
    var s =abs((a+b)-(c+d))
    var result = s
    s = abs((a+c) - (b+d))
    if(s <= result) result = s
    s = abs((a+d) - (b+c))
    if(s <= result) result = s
    println(result)
}
