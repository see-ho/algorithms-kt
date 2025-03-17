fun main(){
    val arr = readln().reversed().split(" ").map{it.toInt()}
    if(arr[0]>arr[1]) println(arr[0])
    else println(arr[1])
}