fun main(){
    val t = readln().toInt()
    repeat(t){
        println(isValid())
    }
}

fun isValid(): String{
    val n = readln().toInt()
    val pNums = Array(n){ readln() }.sorted()

    for(i in 0 until n-1){
        if(pNums[i+1].startsWith(pNums[i])){
            return "NO"
        }
    }

    return "YES"
}
