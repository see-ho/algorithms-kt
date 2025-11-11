fun main() {
    val n = readln().toInt()
    val dp = LongArray(n + 1)
    dp[1] = 1
    if (n >= 2) dp[2] = 1

    for (i in 3..n) {
        dp[i] = dp[i - 1] + dp[i - 2]
    }

    println(dp[n])
}
