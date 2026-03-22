fun main() {
    val visited = BooleanArray(10)
    val arr = IntArray(10)

    var min = "9999999999"
    var max = "0"

    val k = readln().toInt()
    val sign = readln().split(" ")

    fun dfs(depth: Int, k: Int) {
        if (depth == k + 1) {
            val result = arr.slice(0..k).joinToString("")
            if (result < min) min = result
            if (result > max) max = result
            return
        }

        for (i in 0..9) {
            if (visited[i]) continue

            if (depth > 0) {
                val prev = arr[depth - 1]
                val cur = i

                if (sign[depth - 1] == "<" && prev > cur) continue
                if (sign[depth - 1] == ">" && prev < cur) continue
            }

            visited[i] = true
            arr[depth] = i

            dfs(depth + 1, k)

            visited[i] = false
        }
    }

    dfs(0, k)

    println(max)
    println(min)
}
