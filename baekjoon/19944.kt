fun main(){
    val arr = readln().split(" ").map { it.toInt() }
    if(arr[1]<=2) println("NEWBIE!")
    else if(arr[1]<= arr[0]) println("OLDBIE!")
    else println("TLE!")
}