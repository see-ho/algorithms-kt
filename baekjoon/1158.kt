fun main() {
    val (n, k) = readln().split(" ").map{ it.toInt()}
    
    val arr = ArrayDeque<Int>()
    repeat(n) { arr.addLast(it + 1) }

    val answer = mutableListOf<Int>()

    while (arr.isNotEmpty()) {
        repeat(k - 1) {
            arr.addLast(arr.removeFirst())  // 한 칸씩 뒤로 보내기
        }
        answer.add(arr.removeFirst())       // 제거
    }

    println(answer.joinToString(prefix = "<", postfix = ">"))
}