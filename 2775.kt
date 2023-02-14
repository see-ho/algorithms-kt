fun main() {
    val t = readln().toInt()
    repeat(t){
        val k = readln().toInt()
        val n  = readln().toInt()
        val arr = Array<Int>(n){i->i+1}
        for(i in 1 .. k){
            val arr2 = Array<Int>(n){0}
            for(j in 0 until n){
                for(l in 0..j)
                    arr2[j] += arr[l]
            }
            for(a in arr2)
                arr[arr2.indexOf(a)] = a
        }
        println(arr[n-1])
    }
}
