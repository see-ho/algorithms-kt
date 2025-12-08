fun main(){
    while(true){
        val (a, b, c) = readln().split(" ").map { it.toInt() }
        if(a == 0 && b == 0 && c == 0) break

        val arr = arrayOf(a,b,c)
        arr.sortDescending()

        if(arr[0] > arr[1] + arr[2]) println("Invalid")
        else if(a == b && b == c) println("Equilateral")
        else if(a == b || b == c || a == c) println("Isosceles")
        else println("Scalene")
    }
}
