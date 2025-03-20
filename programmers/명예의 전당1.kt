class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var rankingArr: IntArray = intArrayOf()

        for((index,value) in score.withIndex()){
            if(index < k) {
                rankingArr = rankingArr.plus(score[index])
            }
            else {
                if(value> rankingArr.minOrNull()!!){
                    rankingArr[rankingArr.indexOf(rankingArr.minOrNull()!!)] = value
                }
            }
            answer = answer.plus(rankingArr.minOrNull()!!)
        }
        return answer
    }
}