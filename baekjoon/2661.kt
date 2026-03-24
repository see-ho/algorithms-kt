fun main() {
    val n = readln().toInt()

    fun isGood(s: String): Boolean {
        for (len in 1..s.length / 2) {
            if (s.substring(s.length - len) ==
                s.substring(s.length - 2 * len, s.length - len)
            ) return false
        }
        return true
    }

    fun make(s: String): Boolean {
        if (s.length == n) {
            println(s)
            return true
        }

        for (i in 1..3) {
            val next = s + i
            if (isGood(next) && make(next)) return true
        }

        return false
    }

    make("")
}
