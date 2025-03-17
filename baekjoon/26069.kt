fun main(){
    val dance = hashMapOf<String,Boolean>()
    val num = readln().toInt()
    val br = System.`in`.bufferedReader()
    repeat(num){
        val (p1,p2) = br.readLine().split(" ")
        if(p1=="ChongChong"||p2=="ChongChong"|| dance[p1] == true ||dance[p2]==true){
            dance[p1] = true
            dance[p2] = true
        }
    }
    println(dance.size)
}
