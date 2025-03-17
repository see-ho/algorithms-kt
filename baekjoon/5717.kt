fun main(){
    while(true){
        val arr = readln().split(" ").map { it.toInt() }
        if(arr[0]==0&&arr[1]==0) break
        println(arr[0]+arr[1])
    }
}