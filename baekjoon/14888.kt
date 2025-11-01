fun main() {
    readln()
    val aArray = readln().split(" ").map { it.toInt() }
    val operators = readln().split(" ").map { it.toInt() }
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE

    fun dfs(index: Int, curr: Int, plus: Int, minus: Int, mul: Int, div: Int) {
        if (index == aArray.size) {
            if (curr > max) max = curr
            if (curr < min) min = curr
        }

        if (plus > 0) dfs(index + 1, curr + aArray[index], plus - 1, minus, mul, div)
        if (minus > 0) dfs(index + 1, curr - aArray[index], plus, minus - 1, mul, div)
        if (mul > 0) dfs(index + 1, curr * aArray[index], plus, minus, mul - 1, div)
        if (div > 0) dfs(index + 1, curr / aArray[index], plus, minus, mul, div - 1)
    }
    
    dfs(1, aArray[0], operators[0], operators[1], operators[2], operators[3])

    println(max)
    println(min)
}
