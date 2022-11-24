import java.util.*

fun main() = with(Scanner(System.`in`)){
    var a = nextInt()
    var b = nextInt()
    var c = nextInt()

    println((a+b)%c)
    println(((a%c)+(b%c))%c)
    println((a*b)%c)
    println((a%c)*(b%c)%c)
}