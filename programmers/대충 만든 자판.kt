import kotlin.math.min

class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var alphaArr = IntArray(26,{-1})

        keymap.forEach { s ->
            s.mapIndexed { index, it ->
                val idx = it.code-65
                if(alphaArr[idx] == -1){
                    alphaArr[idx] = index+1
                }else{
                    alphaArr[idx] = min(alphaArr[idx],index+1)
                }
            }
        }

        return targets.map { target ->
            if (target.any { alphaArr[it.code - 65] == -1 }) {
                -1
            } else {
                target.sumOf { alphaArr[it.code - 65] }
            }
        }.toIntArray()
    }
}