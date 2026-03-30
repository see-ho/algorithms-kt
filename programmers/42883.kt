class Solution {
    fun solution(number: String, k: Int): String {
        val stack = ArrayDeque<Char>()
        var remain = k

        for (c in number) {
            while (remain > 0 && stack.isNotEmpty() && stack.last() < c) {
                stack.removeLast()
                remain--
            }
            stack.addLast(c)
        }

        return stack.take(number.length - k).joinToString("")
    }
}
