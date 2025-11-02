fun main() {
    val n = readln().toInt()
    val arr = IntArray(n)

    repeat(n) { i ->
        arr[i] = readln().toInt()
    }

    arr.sort()

    var max = 0

    for (i in 0 until n) {
        val weight = arr[i] * (n - i)
        if (max < weight) max = weight
    }

    println(max)
}
