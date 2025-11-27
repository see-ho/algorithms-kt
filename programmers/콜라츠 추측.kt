class Solution {
    fun solution(num: Int): Int {
        fun collatz(num: Long, curr:Int): Int{
            if(curr == 500) return -1
            if(num == 1L) return curr
            if(num %2 == 0L) return collatz(num/2, curr+1)
            else return collatz(num*3+1, curr+1)
        }

        return collatz(num.toLong(),0)
    }
}
