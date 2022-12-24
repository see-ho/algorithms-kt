fun main(){
    val num = readln().toLong()
    var mult: Long  = 1
    for(i in 1..num){ mult *= i }
    println(mult)
}