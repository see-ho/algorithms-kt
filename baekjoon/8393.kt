fun main(){
    val num = readLine()!!.toInt()
    var sum : Int = 0
    for(i in 1..num){
        sum += i
    }
    print(sum)
}