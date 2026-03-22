fun main(){
    val t = readln().toInt()

    repeat(t){
        val n = readln().toInt()
        val arr = Array(n){
            val (doc, interview) = readln().split(" ").map { it.toInt() }
            doc to interview
        }

        arr.sortBy { it.first }

        var answer = 1
        var minInterView = arr[0].second
        
        for(i in 1 until n) {
            if(arr[i].second < minInterView){
                answer++
                minInterView = arr[i].second
            }
        }
        
        println(answer)
    }
}
