fun main(){
    val t = readln().toInt()
    repeat(t){
        val n = readln().toInt()
        val stockPrices = readln().split(" ").map { it.toLong() }

        var money = 0L
        var max = stockPrices[n-1]

        for ( i in n-2 downTo 0){
            val now = stockPrices[i]
            if(now < max) {
                money += max - now
            } else {
                max = now
            }
        }
        println(money)
    }
}
