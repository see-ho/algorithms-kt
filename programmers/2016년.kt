class Solution {
    fun solution(a: Int, b: Int): String {

        val dayOfWeek = arrayOf("FRI","SAT","SUN","MON","TUE","WED","THU")
        val monthDate = intArrayOf(31,29,31,30,31,30,31,31,30,31,30,31)

        var date = 0;

        for(i in 1..a) {
            if(i == a){
                date += b
            }
            else{
                date += monthDate[i-1]
            }
        }
        return dayOfWeek[(date+6) % 7]
    }
}