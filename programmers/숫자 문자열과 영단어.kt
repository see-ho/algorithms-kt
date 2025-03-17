class Solution {
    fun solution(s: String): Int {
        var answer= ""
        var inputArr = s.substring(0)
        val numArr = charArrayOf('0','1','2','3','4','5','6','7','8','9')
        val numTextArr = arrayListOf("zero","one","two","three","four","five","six","seven","eight","nine")

        var index = 0
        while( index < inputArr.length ){
            if(numArr.contains(inputArr[index])){
                answer = answer.plus(inputArr[index])
                index++
            }
            else{
                var text = ""
                do{
                    text = text.plus(inputArr[index])
                    index++
                }while(!numTextArr.contains(text))
                answer = answer.plus(numTextArr.indexOf(text))
            }
        }
        return answer.toInt()
    }
}