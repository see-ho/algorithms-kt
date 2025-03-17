class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String>       {
        var i = strings.size -1
        while (i > 0){
            var j = strings.size -1
            while (j > 0){
                if(strings[j][n] < strings[j-1][n]){
                    val tmpText = strings[j]
                    strings[j] = strings[j-1]
                    strings [j-1] = tmpText
                }
                else if (strings[j][n] == strings[j-1][n]){
                    if(strings[j] < strings[j-1]){
                        val tmpText = strings[j]
                        strings[j] = strings[j-1]
                        strings [j-1] = tmpText
                    }
                }
                j--
            }
            i--
        }
        return strings
    }
}