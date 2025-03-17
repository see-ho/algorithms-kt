fun main(){
    val card = ArrayDeque<Int>()
    repeat(readln().toInt()) {
        card.add(it+1)
    }
    while(card.size>1){
        card.removeFirst()
        card.add(card.removeFirst())
    }
    println(card.first())
}