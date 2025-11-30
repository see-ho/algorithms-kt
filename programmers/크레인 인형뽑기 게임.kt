import kotlin.collections.ArrayDeque

class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0

        val stacks = Array(board[0].size) { ArrayDeque<Int>() }

        for (r in board.indices) {
            for (c in board[0].indices) {
                val doll = board[r][c]
                if (doll != 0) stacks[c].addLast(doll)
            }
        }

        val basket = ArrayDeque<Int>()

        moves.forEach {
            if(stacks[it-1].isNotEmpty()) {
                val doll = stacks[it-1].removeFirst()

                if(basket.isNotEmpty() && basket.last() == doll){
                    basket.removeLast()
                    answer+=2
                } else {
                    basket.addLast(doll)
                }
            }
        }
        return answer
    }
}
