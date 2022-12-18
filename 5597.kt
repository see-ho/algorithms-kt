fun main(){
    val arr = arrayListOf<Int>()
    val noArr = arrayListOf<Int>()
    repeat(28){
        arr.add(readln().toInt())
    }
    for(i in 1..30){
        if(!arr.contains(i)) noArr.add(i)
    }
    println(noArr.minOrNull())
    println(noArr.maxOrNull())
}