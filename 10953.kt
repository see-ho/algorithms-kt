fun main(){
    val num = readln().toInt()
    repeat(num){
        val arr = readln().split(",").map { it.toInt() }
        println(arr[0]+arr[1])
    }
}