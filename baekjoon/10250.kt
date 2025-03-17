fun main(){
    val t = readln().toInt()
    repeat(t){
        val (h,w,n) = readln().split(" ").map { it.toInt() }
        if(n%h == 0)
            println(h*100+n/h)
        else
            println(n%h*100+n/h+1)
    }
}