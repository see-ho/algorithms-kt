fun main(){
    val str = readln()
    var tmp = str[0]
    var check = 0
    str.forEach{
        if(it != tmp) {
            check++
            tmp = it
        }
    }
    if(tmp == str[0])
        println(check/2)
    else
        println(check/2+1)
}