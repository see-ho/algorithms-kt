fun main() {
    val (n, score, p) = readln().split(" ").map { it.toInt() }

    if (n == 0) {
        println(1)
        return
    }

    val scores = readln().split(" ").map { it.toInt() }

    if(n == p && scores.last() >= score) {
        print(-1)
        return
    }
    
    var rank = 0
    
    for(s in scores){
        if(s > score) rank++
    }

    print(rank + 1)
}
