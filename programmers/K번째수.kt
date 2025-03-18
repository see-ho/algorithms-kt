class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()

        for(value in commands){
            var sliceArr = array.slice(value[0]-1..value[1]-1)
            answer = answer.plus(sliceArr.sorted()[value[2]-1])
        }
        return answer
    }
}