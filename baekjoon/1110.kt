fun main(){
    val start = readLine()!!.toInt()
    var check = 1
    var num = start
    while(true){
        var ten = num/10
        var one = num%10
        num = (one * 10) + ((ten + one) % 10)
        if(num == start) break
        else check++
    }
    print(check)
}