import java.util.*

fun main(){
    val n = readln().toInt()
    val pqPlus = PriorityQueue<Int>(Comparator.reverseOrder())
    val pqMinus = PriorityQueue<Int>()
    var zero = 0
    var answer = 0

    repeat(n){
        val num = readln().toInt()
        if(num > 0) pqPlus.add(num)
        else if( num == 0 ) zero++
        else pqMinus.add(num)
    }

    while(pqPlus.size > 1 ){
        val first = pqPlus.poll()
        val second = pqPlus.poll()
        if(second == 1) {
            answer += first + second
        }
        else answer += first * second
    }

    if(pqPlus.isNotEmpty()) answer += pqPlus.poll()

    while(pqMinus.size > 1){
        val first = pqMinus.poll()
        val second = pqMinus.poll()
        answer += first * second
    }

    if(zero > 0 && pqMinus.isNotEmpty()) pqMinus.poll()

    if(pqMinus.isNotEmpty()) answer += pqMinus.poll()

    println(answer)
}
