import java.util.Stack

fun main(){
    val arr = List(readln().toInt()) { readln().toInt() }
    val stack = Stack<Pair<Int,Long>>()
    var answer = 0L

    arr.forEach {
        var count = 1L

        while(stack.isNotEmpty()&& stack.peek().first < it) {
            answer += stack.pop().second
        }

        if(stack.isNotEmpty() && stack.peek().first == it) {
            val prev = stack.pop()
            count = prev.second + 1L
            answer += prev.second
        }
        if(stack.isNotEmpty()){
            answer++
        }
        stack.push(Pair(it,count))
    }
    println(answer)
}
