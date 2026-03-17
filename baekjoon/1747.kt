fun main(){
    var n = readln().toInt()
     while (true){
       if(isPrime(n) && isPalindrome(n)) {
            print(n)
            break
        }
       else n++
     }
}

fun isPrime(n: Int): Boolean {
    if(n==1) return false
    if(n==2) return true
    if(n%2==0) return false
    var k = 3
    while(k * k <= n){
        if(n % k == 0) return false
        k += 2
    }
    return true
}

fun isPalindrome(n: Int): Boolean {
    val s = n.toString()
    return s == s.reversed()
}
