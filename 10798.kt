fun main(){
    val arr = arrayListOf<List<String>>()
    repeat(5){
        arr.add(readln().split(""))
    }
    var maxL = 0
    for(list in arr){
        if(list.size>=maxL)
            maxL = list.size
    }
    for(i in 0 until maxL-1){
        for(j in 0 until 5)
            if(i<arr[j].size-1) print(arr[j][i])
            else print("")
    }
}
