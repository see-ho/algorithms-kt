fun main() {
    val num = readln().toInt()
    val arr = readln()
    var sum = 0
    for(i in 0 until num){
        sum += arr[i].digitToInt()
    }
    println(sum)
}