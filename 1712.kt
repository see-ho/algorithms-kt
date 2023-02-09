import java.util.*

fun main() = with(Scanner(System.`in`)){
    val a  = nextInt()
    val b = nextInt()
    val c = nextInt()
    if((c-b)==0 || a/(c-b) < 0)
        println(-1)
    else
        println(a/(c-b)+1)
}
