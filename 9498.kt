import java.util.Scanner;

fun main() = with(Scanner(System.`in`)){
    var score = nextInt()

    when(score/10){
        10->println("A")
        9 ->println("A")
        8 -> println("B")
        7 -> println("C")
        6 -> println("D")
        else -> println("F")
    }
}