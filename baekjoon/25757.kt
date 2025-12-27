fun main(){
    val (N, game) = readln().split(" ")
    val players = mutableSetOf<String>()
    repeat(N.toInt()){
        players.add(readln())
    }
    when(game){
        "Y" -> println(players.size)
        "F" -> println(players.size / 2)
        else -> println(players.size / 3)
    }
}
