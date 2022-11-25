import java.util.*

fun main() = with(Scanner(System.`in`)){
    var a = nextInt()
    var b = nextInt()

    if(a>b) print(">")
    else if (a<b) print("<")
    else print("==")
}