fun main() {
    val n = readln().toInt()
    val board = Array(n) { readln().toCharArray() }

    var heartX = 0
    var heartY = 0

    loop@ for (i in 0 until n) {
        for (j in 0 until n) {
            if (board[i][j] == '*') {
                heartX = i + 1
                heartY = j
                break@loop
            }
        }
    }

    var leftArm = 0
    var rightArm = 0
    var waist = 0
    var leftLeg = 0
    var rightLeg = 0

    var y = heartY - 1
    while (y >= 0 && board[heartX][y] == '*') {
        leftArm++
        y--
    }

    y = heartY + 1
    while (y < n && board[heartX][y] == '*') {
        rightArm++
        y++
    }

    var x = heartX + 1
    while (x < n && board[x][heartY] == '*') {
        waist++
        x++
    }

    var leftLegX = heartX + waist + 1
    x = leftLegX
    y = heartY - 1
    while (x < n && y >= 0 && board[x][y] == '*') {
        leftLeg++
        x++
    }

    x = leftLegX
    y = heartY + 1
    while (x < n && y < n && board[x][y] == '*') {
        rightLeg++
        x++
    }

    println("${heartX + 1} ${heartY + 1}")
    println("$leftArm $rightArm $waist $leftLeg $rightLeg")
}
