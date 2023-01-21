fun main(){
    val arr = arrayListOf<Int>()
    repeat(3){
        arr.add(readln().toInt())
    }
    if(arr[0]==60&&arr[0]==arr[1]&&arr[0]==arr[2]) print("Equilateral")
    else if(arr[0]+arr[1]+arr[2]==180){
        if(arr[0]==arr[1]||arr[0]==arr[2]||arr[2]==arr[1]) print("Isosceles")
        else print("Scalene")
    }
    else print("Error")
}