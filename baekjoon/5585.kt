fun main(){
    var n = 1000-readln().toInt()
    val arr = arrayListOf<Int>(500,100,50,10,5,1)
    var cnt = 0
    repeat(6){
        cnt += n / arr[it]
        n %= arr[it]
    }
    println(cnt)
}