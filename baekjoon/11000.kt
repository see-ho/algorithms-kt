import java.util.*

fun main(){
    val n = readln().toInt()
    val classes = Array(n) { readln().split(" ").map { it.toInt() }}
    classes.sortBy { it[0] }

    val pq = PriorityQueue<Int>()

    for ((start, end) in classes) {
        if(pq.isNotEmpty() && pq.peek() <= start) {
            pq.poll()
        }
        pq.add(end)
    }
    println(pq.size)
}
