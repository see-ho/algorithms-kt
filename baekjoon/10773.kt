import java.util.*

fun main(){
    val k = readln().toInt()
    val stack = Stack<Int>()

    repeat(k){
        val num = readln().toInt()
        if(num == 0) stack.pop()
        else stack.push(num)
    }

    println(stack.sum())
}
