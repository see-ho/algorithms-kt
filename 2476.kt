fun main(){
    val num = readln().toInt()
    var result = 0
    repeat(num){
        val arr = readln().split(" ").map { it.toInt() }
        var nMax = 0
        if(arr[0]==arr[1]&&arr[0]==arr[2]) nMax = 10000+arr[0]*1000
        else if(arr[0]!=arr[1]&&arr[0]!=arr[2]&&arr[1]!=arr[2]) {
            val max = arr.maxOrNull()!!
            nMax=max*100
        }
        else {
            if (arr[0] == arr[1])
                nMax = 1000 + arr[0] * 100
            else if(arr[0]==arr[2])
                nMax =1000 + arr[0] * 100
            else
                nMax = 1000 + arr[1] * 100
        }
        if( nMax > result)
            result = nMax
    }
    println(result)
}