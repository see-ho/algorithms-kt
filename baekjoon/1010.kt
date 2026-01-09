fun main() {
    fun comb(n: Int, r: Int): Long {
        val k = minOf(r, n - r)
        var result = 1L
        for (i in 1..k) {
            result = result * (n - k + i) / i
        }
        return result
    }

    val t = readln().toInt()
    repeat(t) {
        val (n, m) = readln().split(" ").map { it.toInt() }
        println(comb(m, n))
    }
}
