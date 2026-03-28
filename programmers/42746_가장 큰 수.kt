class Solution {
    fun solution(numbers: IntArray): String {
        val nums = numbers.map { it.toString() }
        val sortedNumbers = nums.sortedWith(Comparator { o1, o2 ->
            (o2 + o1).compareTo(o1 + o2)
        })
        if (sortedNumbers[0] == "0") return "0"
        return sortedNumbers.joinToString("")
    }
}
