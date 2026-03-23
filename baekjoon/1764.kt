fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    val set = HashSet<String>()

    repeat(n) {
        set.add(readln())
    }

    val result = mutableListOf<String>()

    repeat(m) {
        val name = readln()
        if (name in set) {
            result.add(name)
        }
    }

    result.sort()

    println(result.size)
    result.forEach { println(it) }
}
