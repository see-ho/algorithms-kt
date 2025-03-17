fun main(){
    val num = readln().toInt()
    var cute =0
    var nCute =0
    repeat(num){
        if(readln().toInt()==1) cute++
        else nCute++
    }
    if(cute>nCute) println("Junhee is cute!")
    else println("Junhee is not cute!")
}