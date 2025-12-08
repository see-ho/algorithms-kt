fun main() {
    val n = readln().toInt()
    val channels = List(n) { readln() }

    val idx1 = channels.indexOf("KBS1")
    var idx2 = channels.indexOf("KBS2")
    if (idx1 > idx2) idx2++

    val sb = StringBuilder()

    repeat(idx1) { sb.append('1') }
    repeat(idx1) { sb.append('4') }

    repeat(idx2) { sb.append('1') }
    repeat(idx2 - 1) { sb.append('4') }

    println(sb)
}
