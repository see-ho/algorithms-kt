fun main(){
    val m = readln().toInt()
    val d = readln().toInt()
    if(m<2 || m==2&&d<18)
        println("Before")
    else if(m == 2 && d == 18)
        println("Special")
    else
        println("After")
}
