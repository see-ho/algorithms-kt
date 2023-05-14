fun main(){
    val n = readln().toInt()
    val dp = IntArray(n+1){0}
    for(i in 0..n){
        when(i){
            0 -> dp[0] = 1
            1 -> dp[1] = 3
            else -> dp[i] = (2*dp[i-1]+dp[i-2])%9901
        }
    }
    println(dp[n])
}
