import java.util.Scanner
import kotlin.math.max

fun main() = with(Scanner(System.`in`)){
    var n1 = nextInt()
    var n2 = nextInt()
    var n3 = nextInt()

    if(n1==n2&&n1==n3) print(10000+n1*1000)
    else if((n1==n2)||(n1==n3)) print(1000+n1*100)
    else if(n2==n3) print(1000+n2*100)
    else print(max(max(n1,n2),n3)*100)
}