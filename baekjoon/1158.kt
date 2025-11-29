fun main() {
    val (n, k) = readln().split(" ").map{ it.toInt()}
    
    val arr = ArrayDeque<Int>()
    repeat(n) { arr.addLast(it + 1) }

    val answer = mutableListOf<Int>()

    while (arr.isNotEmpty()) {
        repeat(k - 1) {
            arr.addLast(arr.removeFirst())
        }
        answer.add(arr.removeFirst()) 
    }

    println(answer.joinToString(prefix = "<", postfix = ">"))
}