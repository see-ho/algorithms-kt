fun main() {
    val n = readln().toInt()
    val score = IntArray(n + 1)
    for (i in 1..n) score[i] = readln().toInt()
    val dp = IntArray(n + 1)

    if (n >= 1) dp[1] = score[1]
    if (n >= 2) dp[2] = score[1] + score[2]
    if (n >= 3) dp[3] = maxOf(score[1] + score[3], score[2] + score[3])

    for (i in 4..n) {
        dp[i] = maxOf(dp[i - 2], dp[i - 3] + score[i - 1]) + score[i]
    }

    println(dp[n])
}
