fun main(){
    var sum = 0
    repeat(5){
        var num = readln().toInt()
        if(num <40) sum += 40
        else sum += num
    }
    println(sum/5)
}