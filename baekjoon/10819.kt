import kotlin.math.abs

fun main() {
    val n = readln().toInt()
    val nums = readln().split(" ").map { it.toInt() }

    val visited = BooleanArray(n)
    val arr = IntArray(n)

    var max = 0

    fun dfs(depth: Int) {
        if (depth == n) {
            var sum = 0
            for (i in 0 until n - 1) {
                sum += abs(arr[i] - arr[i + 1])
            }
            max = maxOf(max, sum)
            return
        }

        for (i in 0 until n) {
            if (visited[i]) continue

            visited[i] = true
          
            arr[depth] = nums[i]
          
            dfs(depth + 1)
            
            visited[i] = false
        }
    }

    dfs(0)

    print(max)
}
