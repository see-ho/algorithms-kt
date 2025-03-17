fun main(){
    var a = arrayListOf<Int>()
    for(i in 0..9){
        val num = readln().toInt()%42
        if(!a.contains(num)) a.add(num)
    }
    print(a.size)
}