fun main(){
    val (r, c) = readln().split(" ").map { it.toInt() }
    val board = Array(r) { readln().toCharArray() }

    val dy = intArrayOf(-1, 1, 0, 0)
    val dx = intArrayOf(0, 0, -1, 1)

    val visited = BooleanArray(26)
    var answer = 0

    fun dfs(y: Int, x: Int, depth: Int) {
        answer = maxOf(answer, depth)

        for (i in 0 until 4) {
            val ny = y + dy[i]
            val nx = x + dx[i]

            if (ny !in 0 until r || nx !in 0 until c) continue

            val idx = board[ny][nx] - 'A'
            if (visited[idx]) continue

            visited[idx] = true
            dfs(ny, nx, depth + 1)
            visited[idx] = false
        }
    }

    visited[board[0][0] - 'A'] = true
    dfs(0, 0, 1)

    println(answer)
}
