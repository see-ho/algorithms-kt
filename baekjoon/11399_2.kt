fun main() {
    val n = readln().toInt()
    val pList = readln().split(" ").map { it.toInt() }.sorted()

    var sum = 0
    var answer = 0

    for (i in 0 until n) {
        sum += pList[i]
        answer += sum
    }

    println(answer)
}
