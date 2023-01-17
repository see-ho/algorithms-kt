fun main(){
    val arr1 = readln().split(" ").map { it.toInt() }
    val arr2 = arr1.sorted()
    println("${arr2[0]} ${arr2[1]} ${arr2[2]}")
}