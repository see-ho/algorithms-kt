fun main(){
    val num = readln().toInt()
    for(i in 1..num){
        val str = readln()
        val strArray: List<String> = str.split("")
        var sum = 0
        var cnt = 0
        for(s in strArray){
            if(s == "O"){
                cnt++
                sum += cnt
            } else if (s == "X"){
                cnt = 0
            }
        }
        println(sum)
    }
}