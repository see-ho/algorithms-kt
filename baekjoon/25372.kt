fun main(){
    val num = readln().toInt()
    for (i in 0 until num){
        val arr = readln()
        if(arr.length in 6..9) println("yes")
        else println("no")
    }
}