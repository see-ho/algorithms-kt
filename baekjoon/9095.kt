fun main() {
    val t = readln().toInt()
    val arr = MutableList(12) { 0 }

    arr[1] = 1
    arr[2] = 2
    arr[3] = 4

    for (i in 4..11) {
        arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3]
    }

    repeat(t) {
        val n = readln().toInt()
        println(arr[n])
    }
}
