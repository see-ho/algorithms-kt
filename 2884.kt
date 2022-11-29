import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    var h = nextInt()
    var m = nextInt()

    if(m>=45)
        m -= 45
    else {
        m += 15
        if(h>0) h -=1
        else h = 23
    }
    println("$h $m")
}