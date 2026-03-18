fun main() {
    val n = readln().toInt()
    val room = Array(n) { readln() }
    var horizontal = 0
    var vertical = 0

    for (i in 0 until n) {
        var space = 0
        for (j in 0 until n) {
            if (room[i][j] == '.') {
                space++
            } else {
                if (space >= 2) {
                    horizontal++
                }
                space = 0
            }
        }
        if (space >= 2) {
            horizontal++
        }
    }

    for (i in 0 until n) {
        var space = 0
        for (j in 0 until n) {
            if (room[j][i] == '.') {
                space++
            } else {
                if (space >= 2) {
                    vertical++
                }
                space = 0
            }
        }
        if (space >= 2) {
            vertical++
        }
    }
    print("$horizontal $vertical")
}
