class Solution {
    fun solution(numbers: IntArray, target: Int): Int {
            return dfs(numbers, 0, 0, target)

    }
}

fun dfs(numbers: IntArray, index: Int, currentSum: Int, target: Int): Int{
   return if(index == numbers.size){
       if(currentSum == target) 1
       else 0
   }
    else
        return dfs(numbers, index+1, currentSum+numbers[index], target) +
                dfs(numbers, index+1, currentSum-numbers[index], target)
}
