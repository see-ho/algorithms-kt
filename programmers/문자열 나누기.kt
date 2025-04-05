class Solution {
    fun solution(s: String): Int {
        var x = s[0]
        var sameCount = 1
        var diffCount = 0
        var splitCount = 0
        for(i in 1 until s.length){
            if(s[i] == x) sameCount++
            else diffCount++
            if(sameCount == diffCount){
                splitCount++
                if(i != s.length-1) x = s[i+1]
                sameCount = 0
                diffCount = 0
            }
        }
        return if(sameCount!=0) splitCount+1 else splitCount
    }
}