class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var wMax = 0
        var hMax = 0
        for(i in sizes.indices){
            if(sizes[i][0] > sizes[i][1]) sizes[i] = intArrayOf(sizes[i][1], sizes[i][0])
            if(wMax < sizes[i][0]) wMax = sizes[i][0]
            if(hMax < sizes[i][1]) hMax = sizes[i][1]
        }
        return wMax * hMax
    }
}
