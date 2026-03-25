class Solution {
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        val sumPlayMap = mutableMapOf<String, Int>()
        val genreMap = mutableMapOf<String, MutableList<Pair<Int, Int>>>()

        for (i in genres.indices) {
            val genre = genres[i]
            val play = plays[i]

            sumPlayMap[genre] = sumPlayMap.getOrDefault(genre, 0) + play
            genreMap.getOrPut(genre) { mutableListOf() }.add(play to i)
        }

        val sortGenres = sumPlayMap.toList().sortedByDescending { it.second }

        for (i in sortGenres.indices) {
            val genre = sortGenres[i].first
            val topSongs = genreMap[genre]!!.sortedWith(
                compareByDescending<Pair<Int,Int>> { it.first }
                    .thenBy { it.second }
            ).take(2)

            for (song in topSongs) {
                answer.add(song.second)
            }
        }

        return answer.toIntArray()
    }
}
