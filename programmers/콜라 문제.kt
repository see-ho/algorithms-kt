class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var exchange = 0
        var remainder = n

        while(remainder >= a){
            exchange += ((remainder/a)*b)
            remainder = (remainder % a) + ((remainder/a)*b)
        }
        return exchange
    }
}