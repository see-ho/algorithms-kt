fun main(){
    val arr = readln().split(" ").map { it.toInt() }
    val chicken = readln().toInt()
    if(arr[0]+arr[1] >= chicken*2) println(arr[0]+arr[1]-(chicken*2))
    else println(arr[0]+arr[1])
}