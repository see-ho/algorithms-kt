fun main() {
    val n = readln().toInt()
    val nums = Array(n) { readln().toInt() }
    val max = nums.max()
    val dp = Array<Pair<Int, Int>>(max + 1) { 0 to 0 }
    dp[0] = 1 to 0
    if (max >= 1) dp[1] = 0 to 1

    for (i in 2..max) {
        val (i1x, i1y) = dp[i - 1]
        val (i2x, i2y) = dp[i - 2]
        dp[i] = (i1x + i2x to i1y + i2y)
    }

    nums.forEach {
        val (x, y) = dp[it]
        println("$x $y")
    }
}
