fun main(){
    val arr = BooleanArray(10000, {false})

    for(i in 1..10000){
        val dn =  i + i.toString().map { it.digitToInt() }.sum()
        if(dn <= 10000) arr[dn-1] = true
    }

    arr.forEachIndexed{ index, it ->
        if(!it) println(index+1)
    }
}
