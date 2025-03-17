import java.util.*

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val stack = Stack<Int>()
    repeat(br.readLine().toInt()){
        val cmd = br.readLine().split(" ")
        when(cmd[0]){
            "push" -> stack.push(cmd[1].toInt())
            "pop" -> {
                if(stack.empty()) bw.write("-1\n")
                else bw.write("${stack.pop()}\n")
            }
            "size" -> bw.write("${stack.size}\n")
            "empty" -> {
                if(stack.empty()) bw.write("1\n")
                else bw.write("0\n")
            }
            "top" -> {
                if (stack.empty()) bw.write("-1\n")
                else bw.write("${stack.peek()}\n")
            }
        }
    }
    br.close()
    bw.flush()
    bw.close()
}