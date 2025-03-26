class Solution {
    fun solution(n: Int, m: Int, sections: IntArray): Int {
        var answer = 0
        var last = sections[0]

        for( section in sections) {
            if(last <= section){
                last = section + m
                answer += 1
            }
        }
        return answer
    }

    fun solution2(n: Int, m: Int, section: IntArray): Int {
        var wallArr = IntArray(n,{1})
        var answer = 0

        for(i in section){
            wallArr[i-1] = 0
        }

        var i = 0
        while(i < wallArr.size ){
            if(wallArr[i] == 0){
                for(j in i .. i+m)
                    wallArr[i] = 1
                i += m
                answer += 1
            }
            else i++
        }

        return answer
    }
}