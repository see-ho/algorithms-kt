fun main(){
    val n = readln()
    val nList = readln().split(" ").map { it.toInt() }.sorted()
    val m = readln()
    val mList = readln().split(" ").map { it.toInt() }

    for( num in mList)
        if(binarySearch(num, nList)) println(1) else println(0)
}

fun binarySearch(num: Int, arr: List<Int>): Boolean{
    var left = 0
    var right = arr.size - 1

    while(left <= right){
        val mid = (left+right)/2
        when{
            arr[mid] == num -> return true
            arr[mid] > num -> right = mid -1
            else -> left = mid +1
        }
    }
    return false
}
