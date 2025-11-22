fun main() {

    val n = readln().toInt()
    val player = Array(n){ readln().split(" ").map { it.toInt() } }

    val sortedPlayers = player.sortedWith(compareBy(
        { it[1] * it[2] * it[3] },
        { it[1] + it[2] + it[3] },
        { it[0] }
    ))

    println(sortedPlayers.take(3).joinToString(" ") { it[0].toString() })
}