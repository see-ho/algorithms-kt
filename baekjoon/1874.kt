import java.util.*

fun main() {
    val n = readln().toInt()
    val targets = ArrayList<Int>()
    repeat(n) {
        targets.add(readln().toInt())
    }
    val stack = Stack<Int>()
    val printStack = Stack<Char>()
    var targetIndex = 0
    var num = 1

    fun push(){
        stack.push(num++)
        printStack.push('+')
    }

    fun pop(){
        stack.pop()
        printStack.push('-')
    }

    while(targetIndex < n){
        val target = targets[targetIndex]
        if(stack.isNotEmpty()&& stack.peek() == target) {
            pop()
            targetIndex++
        }else if(num <= target) {
            push()
        }else if(stack.contains(target)){
                pop()
        }else{
            printStack.clear()
            break
        }
    }

    if(printStack.isNotEmpty())
        printStack.forEach { println(it) }
    else
        println("NO")

}
