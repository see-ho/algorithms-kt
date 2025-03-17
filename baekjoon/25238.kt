fun main(){
    val arr = readln().split(" ").map{it.toInt()}
    val percent = arr[0] * (100 - arr[1])/100
    if(percent >= 100) println(0)
    else println(1)
}