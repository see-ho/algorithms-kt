fun main() {
    val n = readln().toInt()
    val arr = readln().split(" ").map { it.toInt() }

    val list = mutableListOf<Pair<Int, Int>>()

    for (i in 0 until n) {
        list.add(Pair(arr[i], i))
    }

    list.sortBy { it.first }

    val answer = IntArray(n)

    for (i in 0 until n) {
        val originalIndex = list[i].second
        answer[originalIndex] = i
    }

    for (i in 0 until n) {
        print("${answer[i]} ")
    }
}
