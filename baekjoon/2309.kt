fun main() {
    val list = Array(9) { readln().toInt() }

    var diff = list.sum() - 100

    for (i in 0 until 9) {
        for (j in i + 1 until 9) {
            if (list[i] + list[j] == diff) {
                val answer = list.filterIndexed{ idx, _ -> idx != i && idx != j}.sorted()
                answer.forEach { println(it) }
                return
            }
        }
    }
}
