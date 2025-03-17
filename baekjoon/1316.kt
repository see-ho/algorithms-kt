fun main(){
    val n = readln().toInt()
    var result = n
    repeat(n){
        val str = readln()
        val arr = arrayListOf<Char>()
        var cnt =0
        for (i in str){
            if(!arr.contains(i)){
                arr.add(i)
                cnt ++
            }
            else if(i != arr[cnt-1]) {
                result--
                break
            }
        }
    }
    println(result)
}