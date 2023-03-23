fun main() {
    val sb = StringBuffer()
    val br = System.`in`.bufferedReader()
    val queue = ArrayDeque<Int>()
    repeat(br.readLine().toInt()){
        val cmd = br.readLine().split(" ")
        when(cmd[0]){
            "push"->{
                queue.addFirst(cmd[1].toInt())
            }
            "pop"->{
                if(queue.size!=0){
                    sb.append("${queue.removeLast()}\n")
                }
                else
                    sb.append("-1\n")
            }
            "size"->{
                sb.append("${queue.size}\n")
            }
            "empty"->{
                if(queue.isEmpty()) sb.append("1\n")
                else sb.append("0\n")
            }
            "front"->{
                if(queue.isEmpty()) sb.append("-1\n")
                else sb.append("${queue.last()}\n")
            }
            "back"->{
                if(queue.isEmpty()) sb.append("-1\n")
                else sb.append("${queue.first()}\n")
            }
        }
    }
    print(sb)
    br.close()
}