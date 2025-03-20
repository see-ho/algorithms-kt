class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var answer: String = ""
        var cards1Index = 0
        var cards2Index = 0
        var check = 0

        for(word in goal){
            if(cards1Index < cards1.size && cards1[cards1Index] == word){
                cards1Index += 1
                check += 1
            }
            else if (cards2Index < cards2.size && cards2[cards2Index] == word){
                cards2Index += 1
                check += 1
            }
            else break
        }

        if( check == goal.size) answer = "Yes"
        else answer = "No"

        return answer
    }
}