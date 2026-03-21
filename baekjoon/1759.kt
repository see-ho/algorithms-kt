fun main(){
    val (l,c) = readln().split(" ").map { it.toInt() }
    val chars = readln().split(" ").sorted()
    val vowels = listOf('a','e','i','o','u')

    val arr = CharArray(l)

    fun canPassword(): Boolean{
        var vowel = 0
        var consonant = 0

        for(ch in arr) {
            if(ch in vowels) vowel++
            else consonant++
        }

        return vowel >= 1 && consonant >= 2
    }

    fun dfs(start: Int, depth: Int) {
        if (depth == l) {
            if (canPassword()) {
                println(arr.concatToString())
            }
            return
        }

        for (i in start until c) {
            arr[depth] = chars[i][0]
            dfs(i + 1, depth + 1)
        }
    }

    dfs(0, 0)
}
