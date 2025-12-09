fun main(){
    val n = readln().toInt()

    repeat(n){
        val students = readln().split(" ").map { it.toInt() }
        var answer = 0

        for(i in 2..20){
            for(j in 1 until i){
                if( students[i] < students[j] ){
                    answer++
                }
            }
        }
        println("${students[0]} $answer")
    }
}
