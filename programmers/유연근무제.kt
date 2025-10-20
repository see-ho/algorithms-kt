class Solution {
  fun solution(schedules: IntArray, timelogs: Array<IntArray>, startday: Int): Int {
    var answer = 0
    schedules.forEachIndexed { index, schedule ->
        var limitTime = schedule + 10
        if( limitTime % 100 > 59){
            limitTime = (limitTime/100 +1) *100 + (limitTime%100-60)
        }
        var check = 0
        var currentDay = startday
        for(time in timelogs[index]){
            if(currentDay%7==6||currentDay%7==0){
                check++
                currentDay++
            }
            else{
                if(time<=limitTime) check++
                currentDay++
            }
            if(check == 7) answer++
        }
    }
    return answer
  }
}
