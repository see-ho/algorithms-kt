import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val num = br.readLine().toInt()
    repeat(num){
        val arr = br.readLine().split(" ").map{it.toInt()}
        bw.write("${arr[0]+arr[1]}\n")
    }
    bw.flush()
    bw.close()
}