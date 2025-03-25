class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer = 0
        val sortedArr = score.sortedDescending()
        for(i in 0.. sortedArr.size-m step (m)){
            answer += sortedArr.slice(i..i + (m - 1)).minOrNull()!! * m
        }
        return answer
    }
}