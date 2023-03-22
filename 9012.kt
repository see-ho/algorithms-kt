import java.util.*

fun main(){
    repeat(readln().toInt()){
        val str = readln()
        var stack = Stack<Char>()
        var result = true
        str.forEach {
            if (it == '(') stack.push('(')
            else {
                if(stack.empty()){
                    result=false
                    return@forEach
                }
                else stack.pop()
            }
        }
        if(stack.empty()&&result) println("YES")
        else println("NO")
    }
}