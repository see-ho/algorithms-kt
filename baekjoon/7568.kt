fun main() {
    val n = readln().toInt()
    val people = Array(n) { readln().split(" ").map { it.toInt() }.toIntArray() }
    val answer = mutableListOf<Int>()

    people.forEachIndexed { index1, target ->
        var rank = 0
        people.forEachIndexed { index2, other ->
            if (index1 != index2) {
                if (target[0] < other[0] && target[1] < other[1]) rank++
            }

        }
        answer.add(rank + 1)
    }

    answer.forEach { print("$it ") }
}
