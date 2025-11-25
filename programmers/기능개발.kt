class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        val pStack = ArrayDeque<Int>()
        val sStack = ArrayDeque<Int>()
        progresses.forEach { pStack.add(it) }
        speeds.forEach { sStack.add(it) }

        while(pStack.isNotEmpty()){
            pStack.forEachIndexed { index, _ ->
                pStack[index] += sStack[index]
            }

//            repeat(pStack.size) {
//                val progress = pStack.removeFirst()
//                val speed = sStack.removeFirst()
//                pStack.addLast(progress + speed)
//                sStack.addLast(speed)
//            }
            
            var count = 0
            while(pStack.isNotEmpty() && pStack.first()>=100){
                pStack.removeFirst()
                sStack.removeFirst()
                count++
            }
            if(count!=0) answer.add(count)
        }
        return answer.toIntArray()
    }
}
