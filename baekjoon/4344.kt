fun main(){
    val num = readln().toInt()
    for(i in 1..num){
        val arr = readln().split(" ").map { it.toInt() }
        var sum = 0.0
        for(i in 1 until arr.size){
            sum += arr[i]
        }
        val average = sum / arr[0]
        var cnt =0
        for (i in 1 until arr.size){
            if(arr[i]>average) cnt++
        }
        println(String.format("%.3f",cnt.toDouble()/(arr.size-1)*100)+"%")
    }
}