import java.util.*

fun main() = with(Scanner(System.`in`)){
    var chessPiece: Array<Int> = arrayOf(1,1,2,2,2,8)
    for (i in 0..5){
        print("${chessPiece[i]-nextInt()} ")
    }
}