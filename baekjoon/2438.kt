fun main(){
    var num = readLine()!!.toInt()
    for(i in 1..num){
        for(j in 1..i) print("*")
        println(" ")
    }
}