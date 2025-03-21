class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()
        val student1 = intArrayOf(1,2,3,4,5)
        val student2 = intArrayOf(2,1,2,3,2,4,2,5)
        val student3 = intArrayOf(3,3,1,1,2,2,4,4,5,5)

        val score = intArrayOf(0,0,0)

        for((index,value) in answers.withIndex()){
            if(value == student1[index%5]) score[0]++
            if(value == student2[index%8]) score[1]++
            if(value == student3[index%10]) score[2]++
        }

        for( i in 0..2){
            val max = score.maxOrNull()!!
            if(max <= score[i])
                answer = answer.plus(i+1)
        }

        return answer
    }
}