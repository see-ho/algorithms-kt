import java.util.Stack

fun main(){
    val n = readln().toInt()
    val arr = readln().split(" ").map { it.toInt() }
    val answer = IntArray(n) { -1 }
    val stack = Stack<Pair<Int,Int>>()

    arr.forEachIndexed { index, num ->
        while(stack.isNotEmpty() && stack.peek().second < num){
            answer[stack.pop().first] = num
        }
        stack.push(Pair(index,num))
    }

    val sb = StringBuilder()
    answer.forEach { sb.append(it).append(' ') }
    print(sb)
}
