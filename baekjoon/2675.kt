fun main() {
    val num = readln().toInt()
    repeat(num){
        val arr = readln().split(" ")
        for(i in arr[1])
            repeat(arr[0].toInt()){print(i)}
        println("")
    }
}