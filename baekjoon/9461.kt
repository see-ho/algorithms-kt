 fun main(){
    val t = readln().toInt()
    val num = Array(t){ readln().toInt() }
    val max = num.max()
    val dp = Array(max+1){0L}

    if (max >= 1) dp[1] = 1
    if (max >= 2) dp[2] = 1
    if (max >= 3) dp[3] = 1
    if (max >= 4) dp[4] = 2
    if (max >= 5) dp[5] = 2

    for(i in 6..max){
        dp[i] = dp[i-5] + dp[i-1]
    }

    num.forEach { println(dp[it]) }
}
