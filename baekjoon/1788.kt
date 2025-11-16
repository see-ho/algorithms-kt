import kotlin.math.abs

fun main() {
    val num = readln().toInt()

    val n = abs(num)
    if (n == 0) {
        println(0)
        println(0)
        return
    }

    val fb = LongArray(n + 1)
    fb[0] = 0L
    fb[1] = 1L
    for (i in 2..n) {
        fb[i] = (fb[i - 1] + fb[i - 2]) % 1000000000
    }

    val sign = if (num > 0) 1 else if (n % 2 == 0) -1 else 1
    println(sign)
    println(fb[n])
}
