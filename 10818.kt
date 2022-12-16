fun main(){
    val num = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map{it.toInt()}
    println("${arr.minOrNull()} ${arr.maxOrNull()}")
}