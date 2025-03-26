class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0

        for( i in 0 until nums.size-2){
            for(j in i+1 until nums.size){
                for(k in j+1 until nums.size){
                    if( isPrime(nums[i]+nums[j]+nums[k])) {
                        answer += 1
                    }
                }
            }
        }
        return answer
    }

    fun isPrime(num: Int): Boolean {
        var answer = true
        for(i in 2..Math.sqrt(num.toDouble()).toInt()){
            if(num%i == 0) {
                answer = false
                break
            }
        }
        return answer
    }
}