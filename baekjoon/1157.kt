fun main() {
    val word = readln()
    val arr = List(26){0}.toMutableList()
    var cnt = 0
    var save = 0
    for(i in word) {
        if(i.isUpperCase()) arr[i.code-65]++
        else arr[i.code-97]++
    }
    for (i in 0 until 26){
        if (arr[i] == arr.maxOrNull()) {
            save = i
            cnt++
        }
    }
    if(cnt == 1) println((save+65).toChar())
    else println("?")
}