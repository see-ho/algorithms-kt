import java.util.*

fun main() = with(Scanner(System.`in`)){
    val n = nextInt()
    val m = nextInt()
    val array1 = Array(n) { IntArray(m) { 0 } }

    repeat(2){
        repeat(n){
                i->
            repeat(m){
                    j->
                array1[i][j] += nextInt()
            }
        }
    }

    repeat(n){
        i->
        repeat(m){
            j->
            print("${array1[i][j]} ")
        }
        println()
    }
}