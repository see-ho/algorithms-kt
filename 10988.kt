fun main(){
    val str = readln()
    var result = 1
    repeat(str.length/2){
        if(str[it] != str[str.length-1-it]) {
            result = 0
        }
    }
    println(result)
}