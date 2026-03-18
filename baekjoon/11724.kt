import java.util.*

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val nodes = Array(n + 1) { ArrayList<Int>() }
    repeat(m) {
        val (u, v) = readln().split(" ").map { it.toInt() }
        nodes[u].add(v)
        nodes[v].add(u)
    }

    val visited = Array(n + 1) { false }
    val stack = Stack<Int>()
    var answer = 0

    for (i in 1..n) {
        if (!visited[i]) {
            answer++
            stack.add(i)

            while (stack.isNotEmpty()) {
                val node = stack.pop()

                nodes[node].forEach {
                    if (!visited[it]) {
                        visited[it] = true
                        stack.add(it)
                    }
                }
            }
        }
    }

    print(answer)
}
