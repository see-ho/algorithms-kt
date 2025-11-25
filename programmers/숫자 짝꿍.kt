class Solution {
    fun solution(X: String, Y: String): String {
        var xCount = IntArray(10)
        var yCount = IntArray(10)
    
        X.forEach { xCount[it.digitToInt()]++ }
        Y.forEach { yCount[it.digitToInt()]++ }
    
        val sb = StringBuilder()
    
        for(i in 9 downTo 0){
            val same = minOf(xCount[i], yCount[i])
            repeat(same) {sb.append(i)}
        }
    
        if(sb.isEmpty()) return "-1"
        if(sb[0] == '0') return "0"
    
        return sb.toString()
    }
}
