fun main(){
    val (n, m) = readln().split(" ").map { it.toInt() }
    val cards = readln().split(" ").map { it.toLong() }.toLongArray()

    repeat(m){
        cards.sort()
        val sum = cards[0] + cards[1]
        cards[0] = sum
        cards[1] = sum
    }

    println(cards.sum())
}
