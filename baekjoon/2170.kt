import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val lines = Array(n) {
        val st = StringTokenizer(br.readLine())
        intArrayOf(st.nextToken().toInt(), st.nextToken().toInt())
    }

    lines.sortBy { it[0] }
    var currStart = lines[0][0]
    var currEnd = lines[0][1]
    var answer = 0L


    for(i in 1 until n){
        val now = lines[i]
        if(now[0] <= currEnd){
            currEnd = maxOf(now[1], currEnd)
        }
        else {
            answer += currEnd - currStart
            currStart = now[0]
            currEnd = now[1]
        }
    }
    
    answer += currEnd - currStart
    println(answer)
}
