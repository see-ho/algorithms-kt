var cnt = 0
fun main() {
    val num = readln().toInt()
    val sb = StringBuffer()
    hanoi(num,1,2,3,sb)
    println(cnt)
    println(sb)
}
fun hanoi(n:Int,start:Int,tmp:Int,end:Int,sb:StringBuffer){
    if(n==1) {
        sb.append("$start $end\n")
        cnt++
    }
    else {
        hanoi(n - 1, start, end, tmp,sb)
        cnt++
        sb.append("$start $end\n")
        hanoi(n-1,tmp,start,end,sb)
    }
}