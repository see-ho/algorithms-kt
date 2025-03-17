fun main(){
    val num = readLine()!!.split(" ").map{it.toInt()}
    val arr = readLine()!!.split(" ").map{it.toInt()}
    for(i in arr){
        if( i < num[1]) print("$i ")
    }
}