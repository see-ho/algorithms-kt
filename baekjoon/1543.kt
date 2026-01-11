fun main() {
    val doc = readln()
    val word = readln()
    var i = 0
    var count = 0

    while (i <= doc.length - word.length) {
        var ok = true
        for (j in word.indices) {
            if (doc[i + j] != word[j]) {
                ok = false
                break
            }
        }

        if (ok) {
            count++
            i += word.length 
        } else {
            i++
        }
    }
    println(count)
}
