class Solution {
    fun solution(food: IntArray): String {
        var total = 1
        for(value in food){
            if(value%2 == 0) total += value
            else total += value-1
        }

        val answerArr = IntArray(total,{0})
        var  i = 0

        for((index, value) in food.withIndex()){
            var num = if(value%2 == 0) value/2
            else (value-1)/2

            println("$index 번째는 $num 이에용")

            repeat(num){
                answerArr[i] = index
                answerArr[total-1-i] = index
                i++
            }
        }
        return answerArr.joinToString(separator = "")
    }
}