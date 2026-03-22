fun main() {
    while (true) {
        val input = readLine() ?: break

        var x = input.toInt() * 10000000
        val n = readln().toInt()
        val arr = IntArray(n) { readln().toInt() }

        arr.sort()

        var left = 0
        var right = n - 1

        var found = false

        while (left < right) {
            val sum = arr[left] + arr[right]

            if (sum == x) {
                println("yes ${arr[left]} ${arr[right]}")
                found = true
                break
            }

            if (sum < x) left++
            else right--
        }

        if (!found) println("danger")
    }
}
