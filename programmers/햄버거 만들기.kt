import java.util.Stack

class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer = 0
        val burger = Stack<Int>()
        for(i in ingredient){
            burger.add(i)

            if(burger.size >= 4 && burger.slice(burger.size-4 until burger.size) == listOf(1,2,3,1)){
                answer++
                repeat(4) {burger.pop()}
            }
        }
    return answer
    }
}
