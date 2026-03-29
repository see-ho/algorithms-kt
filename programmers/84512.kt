class Solution {
   fun solution(word: String): Int {
        var answer = 0
        val dictionary = mutableListOf<String>()
        val alphabet = arrayOf("A", "E", "I", "O", "U")

        fun makeWord(curr: String) {
            if (curr.isNotEmpty()) {
                dictionary.add(curr)
            }

            if (curr.length == 5) {
                return
            }

            for (i in alphabet.indices) {
                makeWord(curr + alphabet[i])
            }
        }

        makeWord("")

        return dictionary.indexOf(word)+1
    }
}
