fun main(){
    val arr = arrayListOf<List<Int>>()
    repeat(9) {
        arr.add(readln().split(" ").map { it.toInt()})
    }
    var max = 0
    var i = 0
    var j = 0
    repeat(9){
        i1->
        repeat(9){
            i2->
            if(arr[i1][i2]>max) {
                max = arr[i1][i2]
                i = i1
                j = i2
            }
        }
    }
    println(max)
    println("${i+1} ${j+1}")
}