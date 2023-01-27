fun main() {
    val arr = readln().split(" ")
    var cnt = 0
    for(i in arr){
        if(i != "") cnt++
    }
    println(cnt)
}