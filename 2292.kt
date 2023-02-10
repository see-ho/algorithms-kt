fun main(){
    val num = readln().toInt()
    var room = 0
    var cnt = 1
    while (true){
        if(num <= 6*room+1) {
            println(cnt)
            break
        }
        else{
            room += cnt
            cnt++
        }
    }
}
