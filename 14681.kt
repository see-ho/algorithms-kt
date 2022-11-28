fun main(){
    var x = readLine()!!.toInt()
    var y = readLine()!!.toInt()

    if(x>0&&y>0) println(1)
    else if(x>0&&y<0) println(4)
    else if(x<0&&y>0) println(2)
    else println(3)
}