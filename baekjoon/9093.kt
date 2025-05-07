fun main() {
    repeat(readln().toInt()) {
        val str = readln()
        println(str.split(" ").joinToString(" ") { it.reversed() })
    }
}
