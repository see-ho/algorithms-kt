fun main(){
    val arr = mutableListOf<Int>()
    repeat(readln().toInt()){
        arr.add(readln().toInt())
    }
    arr.sort()
    for (i in arr)
        println(i)
}