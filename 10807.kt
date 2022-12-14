fun main(){
    val num = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }
    val target = readLine()!!.toInt()
    var check = 0
    for(i in arr){
        if(i == target) check ++
    }
    print(check)
}