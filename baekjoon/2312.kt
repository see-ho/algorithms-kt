fun main() {
    val t = readln().toInt()

    repeat(t) {
        var n = readln().toInt()
        var div = 2

        while (div * div <= n) {
            if (n % div == 0) {
                var count = 0
                while (n % div == 0) {
                    n /= div
                    count++
                }
                println("$div $count")
            }
            div++
        }

        if (n > 1) {
            println("$n 1")
        }
    }
}
