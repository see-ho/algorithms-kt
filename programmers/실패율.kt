class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var failArr : List<Pair<Int, Double>> = emptyList()

        for(i in 0 until  N){
            var people = 0
            for(j in 0 until stages.size) {
                if(i+1 <= stages[j]) people += 1
            }
            if(people == 0)
                failArr = failArr.plus(Pair(i+1,0.0))
            else
                failArr = failArr.plus(Pair(i+1,stages.count{it ==i+1}.toDouble()/people))

        }
        return failArr.sortedByDescending { it.second } .map { it.first } .toIntArray()
    }
}