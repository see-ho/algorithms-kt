fun main() {
    val t = readln().toInt()
    val out = StringBuilder()

    repeat(t) {
        val n = readln().toInt()
        val order = readln().split(" ").map { it.toInt() }
        val cnt = IntArray(201)
        val isValid = BooleanArray(201)

        for (team in order) cnt[team]++

        for (team in 1..200) {
            if (cnt[team] == 6) isValid[team] = true
        }

        val sum = IntArray(201)
        val fifth = IntArray(201)
        val seen = IntArray(201)
        var score = 1
      
        for (team in order) {
            if (!isValid[team]) continue

            seen[team]++
            val k = seen[team]

            if (k <= 4) sum[team] += score
            else if (k == 5) fifth[team] = score

            score++
        }

        var win = 0
        var bestSum = Int.MAX_VALUE
        var bestFifth = Int.MAX_VALUE

        for (team in 1..200) {
            if (!isValid[team]) continue

            val s = sum[team]
            val f = fifth[team]

            if (s < bestSum || (s == bestSum && f < bestFifth)) {
                bestSum = s
                bestFifth = f
                win = team
            }
        }
        out.append(win).append('\n')
    }
    print(out.toString())
}
