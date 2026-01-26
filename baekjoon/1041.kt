fun main() {
    val n = readln().toLong()
    val dice = readln().split(" ").map { it.toLong() }

    val oneSide = dice.min()

    val pair = listOf(
        minOf(dice[0], dice[5]),
        minOf(dice[1], dice[4]),
        minOf(dice[2], dice[3])
    ).sorted()

    val twoSide = pair[0] + pair[1]
    val threeSide = pair.sum()

    val answer =
        if (n == 1L) {
            dice.sum() - dice.max()
        } else {
            4 * threeSide +
            (8 * n - 12) * twoSide +
            (5 * n * n - 16 * n + 12) * oneSide
        }
        
    println(answer)
}
