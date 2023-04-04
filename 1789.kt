fun main() {
    var num = readln().toLong()
    var cnt = 0
    var i = 1

    while (0 <= num) {
        num -= i
        cnt++
        i++
    }
    print(cnt - 1)
}