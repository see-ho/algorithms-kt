fun main(){
    val n = readln().toInt()

    val flowers = List(n) {
        val (sM, sD, eM, eD) = readln().split(" ").map { it.toInt() }
        (sM to sD) to (eM to eD)
    }.sortedBy { toDate(it.first) }

    var curr = toDate(3 to 1)
    var end = toDate(11 to 30)
    var idx = 0
    var answer = 0
    var nowEnd = 0

    while(curr <= end){
        var found = false
        while (idx < n && toDate(flowers[idx].first) <= curr) {
            nowEnd = maxOf(nowEnd, toDate(flowers[idx].second))
            idx++
            found = true
        }

        if(!found) break
        answer++
        curr = nowEnd
    }

    if (nowEnd <= end) println(0) else println(answer)
}


fun toDate(date: Pair<Int,Int>): Int {
    val months = arrayOf(31,28,31,30,31,30,31,31,30,31,30,31)
    return months.take(date.first - 1).sum() + date.second
}
