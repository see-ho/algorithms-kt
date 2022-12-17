fun main(){
    var arrayList = arrayListOf<Int>()
    repeat(9){
        arrayList.add(readln().toInt())
    }
    println(arrayList.maxOrNull())
    println("${arrayList.indexOf(arrayList.maxOrNull())+1}")
}