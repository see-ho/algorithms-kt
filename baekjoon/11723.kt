import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val m = br.readLine().toInt()
    val arr = BooleanArray(21){false}

    repeat(m){
        val st = StringTokenizer(br.readLine())
        val operator = st.nextToken()

        when (operator) {
            "all" -> arr.fill(true)
            "empty" -> arr.fill(false)
            else -> {
                val x = st.nextToken().toInt()
                when (operator) {
                    "add" -> arr[x] = true
                    "remove" -> arr[x] = false
                    "check" -> sb.append(if (arr[x]) "1\n" else "0\n")
                    "toggle" -> arr[x] = !arr[x]
                }
            }
        }
    }
    print(sb)
}
