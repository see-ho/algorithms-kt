fun main(){
    val (h, w, n, m) = readln().split(" ").map { it.toLong() }
    val row = (h + n) / (n + 1)
    val col = (w + m) / (m + 1)
    println( row * col )
}
