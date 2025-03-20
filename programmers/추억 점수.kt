class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer: IntArray = intArrayOf()
        for (p in photo){
            var yearningSum = 0
            for(person in p){
                if(name.find { it == person } != null ){
                    yearningSum += yearning[ name.indexOf(person)]
                }
            }
            answer = answer.plus(yearningSum)
        }
        return answer
    }
}