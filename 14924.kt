fun main(){
    val arr = readln().split(" ").map { it.toInt() }
    println(arr[1]*arr[2]/(arr[0]*2))
}