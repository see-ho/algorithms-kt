fun main(){
    val num = readln()
    var sec = 0
    for(i in num){
        sec += when(i.code-65){
            in 0..2-> 3
            in 3..5 -> 4
            in 6..8 -> 5
            in 9..11 -> 6
            in 12..14 -> 7
            in 15..18 -> 8
            in 19..21 -> 9
            in 22..25 -> 10
            else -> 0
        }
    }
    println(sec)
}