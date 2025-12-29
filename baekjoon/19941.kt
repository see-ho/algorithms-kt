fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val arr = readln().toCharArray()

    var answer = 0

    for (i in 0 until n) {
        if (arr[i] == 'P') {
            val start = maxOf(0, i - k)
            val end = minOf(n - 1, i + k)

            for (j in start..end) {
                if (arr[j] == 'H') {
                    answer++
                    arr[j] = 'X'
                    break
                }
            }
        }
    }

    println(answer)
}
