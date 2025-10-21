import java.util.Stack

fun main(){
    val n = readln().toInt()
    val arr = List(n) { readln().toInt() }
    var answer = 0L
    val stack = Stack<Int>()

    for(h in arr){
        while (stack.isNotEmpty() && stack.peek() <= h){
            stack.pop()
        }

        answer += stack.size

        stack.push(h)
    }
    println(answer)
}
