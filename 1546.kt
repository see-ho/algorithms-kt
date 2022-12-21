fun main(){
    val num = readln().toInt()
    val arr = readln().split(" ").map{it.toDouble()}
    val arr2 = arrayListOf<Double>()
    val max = arr.maxOrNull()
    var sum = 0.0
    for(i in 0 until num){
        arr2.add(arr[i]/ max!! *100)
        sum += arr2[i]
    }
    print(sum/num)
}