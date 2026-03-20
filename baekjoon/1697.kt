fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val visited = BooleanArray(100001)
    val queue = ArrayDeque<Pair<Int, Int>>()

    queue.add(n to 0)
    visited[n] = true

    while (queue.isNotEmpty()) {
        val (cur, time) = queue.removeFirst()

        if (cur == k) {
            println(time)
            return
        }

        val nexts = intArrayOf(cur - 1, cur + 1, cur * 2)

        for (next in nexts) {
            if (next in 0..100000 && !visited[next]) {
                visited[next] = true
                queue.add(next to time + 1)
            }
        }
    }
}
