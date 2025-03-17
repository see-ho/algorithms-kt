fun main(){
    while(true){
        val (a,b,c) = readln().split(" ")
        if(a!="#"&&b!="0"&&c!="0"){
            if(b.toInt()>17 || c.toInt()>=80)
                println("$a Senior")
            else
                println("$a Junior")
        }
        else break
    }
}