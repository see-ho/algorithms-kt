fun main(){
    val num = readLine()!!.toInt()
    for(i in 1..num){
        var arr = readLine()!!.split(" ").map{it.toInt()}
        println("Case #"+i+": "+(arr[0]+arr[1]));
    }
}