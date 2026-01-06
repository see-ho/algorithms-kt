fun main() {
    val (n, x) = readln().split(" ").map { it.toInt() }
    val arr = readln().split(" ").map { it.toInt() }

    var sum = 0
    for (i in 0 until x) sum += arr[i]

    var maxSum = sum
    var count = 1

    for (i in x until n) {
        sum += arr[i] - arr[i - x]

        if (sum > maxSum) {
            maxSum = sum
            count = 1
        } else if (sum == maxSum) {
            count++
        }
    }

    if (maxSum == 0) {
        print("SAD")
    } else {
        println(maxSum)
        print(count)
    }
}
