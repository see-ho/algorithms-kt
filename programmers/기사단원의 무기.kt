import kotlin.math.sqrt

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer = 1

        for(i in 2..number){
            var factor = 0
            for( j in 1.. sqrt(i.toFloat()).toInt()){
                if(i % j == 0 )
                    factor += 1
            }
            if(sqrt(i.toFloat()).toInt().toFloat() == sqrt(i.toFloat())) factor = factor * 2 -1
            else factor *= 2

            if( factor > limit)
                answer += power
            else
                answer += factor
        }

        return answer
    }
}