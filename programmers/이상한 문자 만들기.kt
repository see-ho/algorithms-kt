class Solution {
    fun solution(s: String): String {
        val sb = StringBuilder()
        var idx = 0
        
        for(c in s) {
            if (c == ' '){
                sb.append(c)
                idx = 0
            } else {
                sb. append(
                    if( idx % 2 == 0) c.uppercaseChar()
                    else c.lowercaseChar()
                )
                idx++
            }
        }
        return sb.toString()
    }
}
