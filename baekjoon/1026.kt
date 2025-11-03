fun main() {
    val n = readln().toInt()
    val aArr = readln().split(" ").map { it.toInt() }.toIntArray()
    val bArr = readln().split(" ").map { it.toInt() }.toIntArray()
    var answer = 0

    aArr.sort()
    bArr.sortDescending()

    for (i in 0 until n) {
        answer  += aArr[i] * bArr[i]
    }

    println(answer)
}
