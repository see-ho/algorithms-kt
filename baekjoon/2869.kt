fun main(){
    val (a,b,v) = readln().split(" ").map{it.toInt()}
    val d = v-a
    if(d==0)
        println(1)
    else if(d%(a-b)!=0)
        println(d/(a-b)+2)
    else
        println(d/(a-b)+1)
}