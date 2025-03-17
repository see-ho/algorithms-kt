fun main(){
    var result =0
    repeat(2){
        var sum = 0
        readln().split(" ").map{sum+=it.toInt()}
        if(result<=sum)
            result = sum
    }
    println(result)
}