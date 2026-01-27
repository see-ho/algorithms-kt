import java.util.Stack

fun main() {
    val gears = Array(4) { ArrayDeque<Int>() }

    repeat(4) {
        gears[it].addAll(readln().map { it - '0' })
    }
    val k = readln().toInt()

    fun rotate(n: Int, direction: Boolean) {
        if (direction)
            gears[n].addFirst(gears[n].removeLast())
        else
            gears[n].addLast(gears[n].removeFirst())

    }

    repeat(k) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        val start = x - 1
        val startDir = (y == 1)

        val willRotate = arrayOfNulls<Boolean>(4)
        willRotate[start] = startDir

        val rotationStack = Stack<Pair<Int, Boolean>>()
        rotationStack.push(start to startDir)

        while (rotationStack.isNotEmpty()) {
            val (curr, dir) = rotationStack.pop()

            if (curr - 1 >= 0 && willRotate[curr - 1] == null) {
                if (gears[curr][6] != gears[curr - 1][2]) {
                    willRotate[curr - 1] = !dir
                    rotationStack.push(curr - 1 to !dir)
                }
            }

            if (curr + 1 <= 3 && willRotate[curr + 1] == null) {
                if (gears[curr][2] != gears[curr + 1][6]) {
                    willRotate[curr + 1] = !dir
                    rotationStack.push(curr + 1 to !dir)
                }
            }
        }

        for (i in 0..3) {
            willRotate[i]?.let {
                rotate(i, it)
            }
        }

    }

    val score = arrayOf(1, 2, 4, 8)
    var answer = 0

    repeat(4) {
        if (gears[it].first() == 1) answer += score[it]
    }
    print(answer)
}
