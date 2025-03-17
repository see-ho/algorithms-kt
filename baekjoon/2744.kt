fun main(){
    val str = readln()
    str.forEach {
        print(
            when (it) {
                in 'A'..'Z' -> it + 32
                else -> it - 32
            }
        )
    }
}