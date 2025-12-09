fun main(){
    val (n, k) = readln().split(" ").map { it.toInt() }
    val countries = mutableListOf<List<Int>>()
    repeat(n){
        countries.add(readln().split(" ").map { it.toInt() })
    }
    var answer = 1
    val target = countries.find { it[0] == k }!!
    val (num, gold, silver, bronze) = target
    for(country in countries){
        if(country[0] == k) continue

        var (tNum, tGold, tSilver, tBronze) = country

        if(tGold > gold) {
            answer++
            continue
        } else if (tGold == gold && tSilver > silver) {
            answer++
        } else if(tGold == gold && tSilver == silver && tBronze > bronze){
            answer++
        }
    }
    println(answer)
}
