fun main() {
    val s = readln()
    var idx = 0
    var num = 0

    while (idx < s.length) {
        num++
        val t = num.toString()
        for (c in t) {
            if (idx < s.length && c == s[idx]) idx++
        }
    }

    print(num)
}
