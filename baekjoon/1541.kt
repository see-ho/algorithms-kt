fun main() {
    val str = readln()
    val nums = str.split("+","-")
    val operator = mutableListOf<Char>()
    str.forEach { if(it=='+'||it=='-') operator.add(it) }
    var cnt = -1
    if(operator.contains('-')) cnt=operator.indexOf('-')
    operator.forEachIndexed {index,i->
        if(cnt!=-1&&index>cnt) operator[index] = '-'
    }
    var result = nums[0].toInt()
    for(i in 1 until nums.size){
        val next = operator[i-1].plus(nums[i]).toInt()
        result += next
    }
    println(result)
}