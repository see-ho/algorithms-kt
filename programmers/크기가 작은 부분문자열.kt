class Solution {
  fun solution(t: String, p: String): Int {
    var answer = 0
    val size = p.length
    for(start in 0..t.length - size) {
        if(t.slice(start until start+size) <= p) answer++
    }
    return answer
  }
}
