class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        val answer = StringBuilder()
        val skipSet = skip.toSet()
        val alphaList = ('a'..'z').filterNot { it in skipSet }

        val size = alphaList.size

        s.forEach { c ->
            val curIdx = alphaList.indexOf(c)
            val nextIdx = (curIdx + index) % size
            answer.append(alphaList[nextIdx])
        }

        return answer.toString()
    }
}