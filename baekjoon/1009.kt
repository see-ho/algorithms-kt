import kotlin.math.pow

fun main(){
    val num = readln().toInt()
    repeat(num) {
        val arr = readln().split(" ").map{ it.toInt() }
        var result = 0
        var num = arr[0]%10
        var b = 1
        if(num==4||num==9){
            b = if (arr[1]%2 != 0) arr[1]%2
            else 2
        }
        else if(num==2||num==3||num==7||num==8) {
            b = if (arr[1] % 4 == 0) 4
            else {
                arr[1] % 4
            }
        }
        else if(num==0) num=10
        result = num.toFloat().pow(b).toInt()
        if (result%10==0) println(10)
        else println(result % 10)
    }
}