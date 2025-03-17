fun main() {
    val br = System.`in`.bufferedReader()
    val list = mutableListOf<Pair<Int, Int>>()
    repeat(br.readLine().toInt()) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        list.add(a to b)
    }

    list.sortWith(compareBy { it.first })
    list.sortWith(compareBy { it.second })
    var cnt = 0
    var chk = 0

    list.forEach {
        if (it.first >= chk) {
            cnt++
            chk = it.second
        }
    }

    br.close()
    println(cnt)
}
