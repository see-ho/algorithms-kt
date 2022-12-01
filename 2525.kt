import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    var time : List<Int> = readLine()!!.split(" ").map{ it.toInt() }
    var h = time[0]
    var m = time[1]
    var end = readLine()!!.toInt()

    if(m+end<60){
        m += end
    }else{
        h = (h + (m+end)/60)%24
        m = (m+end) % 60
    }

    println("$h $m")
}