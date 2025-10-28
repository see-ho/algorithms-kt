import kotlin.math.min

fun main() {
    val n = readln().toInt()
    val arr = readln().split(" ").map { it.toInt() }.sorted()
    val m = readln().toInt()

    if(arr.sum() <= m) println(arr.last())
    else{
        println(setBudget(m, arr))
    }

}

fun setBudget(m: Int, list: List<Int>): Int {
    var left = 0
    var right = list.last()

    while(left <= right){
        val mid = (left+ right) /2
        var sum = 0
        for(num in list) sum += min(num, mid)
        when{
            sum > m -> right = mid - 1
            sum <= m -> left = mid + 1
        }
    }
    return (left+ right) /2
}
