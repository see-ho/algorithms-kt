class Solution {
  fun solution(s: String): Int {
    if(s.length == 1) return 1
    var answer = 1

    fun isPalindrome(left: Int, right: Int): Int {
        var l = left
        var r = right
        while( l >= 0 && r < s.length && s[l] == s[r]){
            l--
            r++
        }
        return r-l-1
    }

    for (i in s.indices){
        answer = maxOf(answer, isPalindrome(i,i))

        if(i+1 < s.length){
            answer = maxOf(answer, isPalindrome(i,i+1))
        }
    }

    return answer
  }
}
