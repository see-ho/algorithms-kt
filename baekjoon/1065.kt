fun main(){
    var num = readln().toInt()
    var check =0
    while(num>0){
        if(arithmeticSequence(num))check++
        num--
    }
    println(check)
}

fun arithmeticSequence(num : Int): Boolean {
    val arr = num.toString().map {
        it.code - '0'.code
    }
    if(arr.size ==4) return false
    if(arr.size ==3){
        return (arr[0]-arr[1] == arr[1]-arr[2])
    }
    return true
}