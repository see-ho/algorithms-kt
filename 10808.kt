fun main(){
    val arr = IntArray(26){0}
    for(i in readln()){
        arr[i.code-97]++
    }
    repeat(26){print("${arr[it]} ")}
}