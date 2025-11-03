fun main(){
    val n = readln().toInt()
    val arr = mutableListOf<Int>()
    var answer = 0

    repeat(n){
        arr.add(readln().toInt())
    }

    for(i in n-1 downTo 1){
        while(arr[i] <= arr[i-1]){
            arr[i-1]--
            answer++
        }
    }

    println(answer)
}
