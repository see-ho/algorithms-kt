fun main(){
    var num = readln().toInt()
    for (i in num downTo 1){
        repeat(i){
            print("*")
        }
        println("")
    }
}