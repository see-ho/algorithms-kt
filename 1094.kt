import java.util.Stack

fun main() {
    val x = readln().toInt()
    val stack = Stack<Int>()
    stack.push(64)
    while(stack.sum() != x){
        val n = stack.pop()/2
        stack.push(n)
        if(stack.sum() < x){
            stack.push(n)
        }
    }
    println(stack.size)
}