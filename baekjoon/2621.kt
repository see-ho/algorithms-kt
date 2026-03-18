fun main(){
    val cards = Array(4) { arrayListOf<Int>() }
    val nums = Array(10){ 0 }
    repeat(5){
        val (color, n) = readln().split(" ")
        val num = n.toInt()
        when(color){
            "R" -> cards[0].add(num)
            "B" -> cards[1].add(num)
            "Y" -> cards[2].add(num)
            "G" -> cards[3].add(num)
        }
        nums[num]++
    }
    val max = nums.indexOfLast { it > 0 }
    
    // 숫자 연속
    if((1..5).any { i -> (i..i+4).all { nums[it] > 0 } }) {
        // 1. 5장 같은 색, 숫자 연속
        if(cards.any { it.size == 5 }){
            print(max+900)
        }
        // 5. 숫자 5개 연속
        else print(max + 500)
    }
    // 4. 5장 색 같음
    else if(cards.any { it.size == 5 }){
        print(max+600)
    }
    // 2. 4개의 숫자가 같을 때
    else if(nums.any { it == 4}) {
        val idx = nums.indexOfFirst { it == 4 }
        print(idx+800)
    }
    // 3. 3,2 같을 때
    else if(nums.any { it == 3} && nums.any { it == 2}){
        val idx3 = nums.indexOfFirst { it == 3 }
        val idx2 = nums.indexOfFirst { it == 2 }
        print(idx3*10+idx2+700)
    }
    // 6. 3개가 같을 때
    else if(nums.any { it == 3 }) print(nums.indexOfFirst { it==3 }+400)
    // 2개가 같을 때
    else if(nums.any { it == 2 }){
        val pairNum = nums.indices.filter { nums[it] == 2 }.sorted()
        // 7. 2,2 일떄
        if(pairNum.size == 2){
            print(pairNum[1]*10 + pairNum[0] + 300)
        }
        // 8. 2개만 같을 때
        else {
            print(pairNum[0] + 200)
        }
    }
    // 9. 어떤 경우도 해당하지 않을 때
    else print(max + 100)
}
