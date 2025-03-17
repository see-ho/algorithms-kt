fun main(){
    val num = readLine()!!.toInt()
    for(i in 0 until num){
        var arr : List<Int> = readLine()!!.split(" ").map { it.toInt() }
        println(arr[0]+arr[1])
    }
}