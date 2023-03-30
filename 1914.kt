import java.math.BigInteger
fun main() {
    val num = readln().toInt()
    val sb = StringBuffer()
    val cnt = BigInteger.valueOf(2).pow(num)-BigInteger.ONE
    println(cnt)
    if(num<21) {
        hanoi(num, 1, 2, 3, sb, num)
        print(sb)
    }
}

fun hanoi(n:Int, start:Int, tmp:Int, end:Int,sb:StringBuffer,num:Int){
    if(n==1){
        sb.append("$start $end\n")
    }
    else{
        hanoi(n-1,start,end,tmp,sb,num)
        sb.append("$start $end\n")
        hanoi(n-1,tmp,start,end,sb,num)
    }
}