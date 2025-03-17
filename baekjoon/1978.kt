fun main(){
    val num = readln().toInt()
    var cnt = num
    val arr = readln().split(" ").map { it.toInt() }
    arr.forEach{
        if(it ==1 ) cnt--
        if(it > 2){
            for( i in 2 until it){
                if(it%i ==0) {
                    cnt--
                    break
                }
            }
        }
    }
    println(cnt)
}
