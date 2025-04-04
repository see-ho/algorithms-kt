class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var rank = 7
        var num0 = lottos.count{it==0}
        lottos.forEach {
            if(win_nums.contains(it)) rank--
        }
        var maxRank = if (rank - num0 > 1) rank - num0 else 1
        if (maxRank == 7) maxRank = 6
        return intArrayOf(maxRank ,if (rank > 6) 6 else rank)
    }
}