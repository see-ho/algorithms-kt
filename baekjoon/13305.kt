fun main(){
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val d = br.readLine().split(" ").map { it.toLong() }
    val p = br.readLine().split(" ").map { it.toLong() }

    var cnt = 0L
    var min = 0

    for( i in 0 until n-1){
        if(p[i] < p[min]) {
            min = i
            cnt += d[i]*p[min]

        }
        else{
            cnt += d[i]*p[min]
        }
    }
    println(cnt)
    br.close()
}