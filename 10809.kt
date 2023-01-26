fun main() {
    val c = readln()
    val arr = List(26){-1}.toMutableList()
    var check = 0
    for(i in c) {
        if(arr[(i.code - 97)] == -1) arr[(i.code - 97)] = check
        check++
    }
    for(i in arr) print("$i ")
}