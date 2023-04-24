fun main(){
    val br = System.`in`.bufferedReader()
    val num = br.readLine().toInt()
    val hashMap = HashMap<String,Int>()
    repeat(num){
        val book = br.readLine()
        val tmp = hashMap[book]?:0
        hashMap[book] = tmp+1
    }
    br.close()
    val arr = hashMap.filter { it.value == hashMap.values.maxOrNull() }.keys
    println(arr.sorted()[0])
}
