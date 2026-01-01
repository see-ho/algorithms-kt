fun main() {
    val (n, score, p) = readln().split(" ").map { it.toInt() }

    if (n == 0) {
        println(1)
        return
    }

    val list = readln().split(" ").map { it.toInt() }

    if (n == p && score <= list.last()) {
        println(-1)
        return
    }

    var higher = 0
    for (s in list) {
        if (s > score) higher++
        else break
    }

    println(higher + 1)
}
