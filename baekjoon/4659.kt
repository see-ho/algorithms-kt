fun main() {
    val br = System.`in`.bufferedReader()

    fun isVowel(c: Char): Boolean {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
    }

    while (true) {
        val s = br.readLine()
        if (s == "end") break

        var hasVowel = false
        var ok = true
        var vowelCnt = 0
        var consCnt = 0

        for (i in s.indices) {
            val c = s[i]

            if (isVowel(c)) {
                hasVowel = true
                vowelCnt++
                consCnt = 0
            } else {
                consCnt++
                vowelCnt = 0
            }

            if (vowelCnt == 3 || consCnt == 3) {
                ok = false
                break
            }

            if (i > 0 && s[i] == s[i - 1]) {
                if (c != 'e' && c != 'o') {
                    ok = false
                    break
                }
            }
        }

        if (!hasVowel) ok = false

        if (ok) {
            println("<$s> is acceptable.")
        } else {
            println("<$s> is not acceptable.")
        }
    }
}
