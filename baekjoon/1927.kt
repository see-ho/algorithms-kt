import java.util.PriorityQueue

fun main() {
    val n = readln().toInt()
    val pq = PriorityQueue<Int>()

    repeat(n) {
        val x = readln().toInt()
        if (x == 0) {
            println(if (pq.isEmpty()) 0 else pq.poll())
        } else {
            pq.add(x)
        }
    }
}
