import java.util.StringTokenizer

fun main() {
    val n = readln().toInt()
    val st = StringTokenizer(readln())

    val frontTaller = IntArray(n + 1)
    for (i in 1..n) {
        frontTaller[i] = st.nextToken().toInt()
    }

    val line = mutableListOf<Int>()

    for (height in n downTo 1) {
        line.add(frontTaller[height], height)
    }

    print(line.joinToString(" "))
}
