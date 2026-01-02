fun main() {
    val n = readln().toInt()
    val switches = readln().split(" ").map { it.toInt() }.toMutableList()
    val students = readln().toInt()

    repeat(students) {
        val (gender, num) = readln().split(" ").map { it.toInt() }
        val idx = num - 1

        if (gender == 1) {
            var i = idx
            while (i < n) {
                switches[i] = 1 - switches[i]
                i += num
            }
        } else {
            var left = idx
            var right = idx

            while (
                left - 1 >= 0 &&
                right + 1 < n &&
                switches[left - 1] == switches[right + 1]
            ) {
                left--
                right++
            }

            for (i in left..right) {
                switches[i] = 1 - switches[i]
            }
        }
    }

    for (i in switches.indices) {
        print("${switches[i]} ")
        if ((i + 1) % 20 == 0) println()
    }
}
