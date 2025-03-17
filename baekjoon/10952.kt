fun main(){
    while(true){
        var arr = readLine()!!.split(" ").map{it.toInt()}
        if(arr[0]!=0 &&  arr[1]!=0) println(arr[0]+arr[1])
        else break
    }
}