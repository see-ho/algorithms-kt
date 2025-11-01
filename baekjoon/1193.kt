fun main() {
    val x = readln().toInt()

    var range = 1
    var num = 1

    while (range + num <= x) {
        range += num
        num++
    }
    num++

    if (num % 2 == 0) println("${num - (x - range + 1)}/${x - range + 1}")
    else println("${x - range + 1}/${num - (x - range + 1)}")

}
