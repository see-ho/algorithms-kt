fun main(){
    val total = readLine()!!.toInt()
    val num = readLine()!!.toInt()
    var sum = 0
    for(i in 0 until num){
        var list = readLine()!!.split(" ").map{it.toInt()}
        sum += (list[0] * list[1])
    }
    if(sum == total)
        print("Yes")
    else
        print("No")
}