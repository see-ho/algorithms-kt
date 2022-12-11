fun main(){
    var num = readLine()!!.toInt()
    for(i in 1..num){
        for(j in 1..num){
            if(j>num-i)print("*")
            else print(" ")
        }
        println(" ")
    }
}