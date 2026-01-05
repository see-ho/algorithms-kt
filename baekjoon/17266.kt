fun main() {
    val n = readln().toInt()
    val m = readln().toInt()
    val arr = readln().split(" ").map { it.toInt() }.sorted()
    var low = 0
    var high = n
    var answer = n

    while (low <= high) {
        val h = (low + high) / 2
        var covered = 0
        var ok = true

        for (x in arr) {
            if (x - h > covered) {
                ok = false
                break
            }
            val right = x + h
            if (right > covered) covered = right
            if (covered >= n) break
        }

        if (ok && covered >= n) {
            answer = h
            high = h - 1
        } else {
            low = h + 1
        }
    }

    print(answer)
}
