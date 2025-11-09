fun main() {
    val n = readln().toInt()
    val counsels = Array(n) {
        val (t, p) = readln().split(" ").map { it.toInt() }
        t to p
    }
    val moneys = Array(n + 2) { 0 }

    for (i in 0 until n) {
        moneys[i + 1] = maxOf(moneys[i + 1], moneys[i])

        val (t, p) = counsels[i]
        if (i + t <= n) {
            moneys[i + t] = maxOf(moneys[i + t], moneys[i] + p)
        }
    }
    println(moneys.max())
}
