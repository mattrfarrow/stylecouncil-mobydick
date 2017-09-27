package mobydick


object Main {

    fun wordCounts(text: String): List<Pair<String,Int>> {
        val words = text.split(' ', '\n')
        return words.map {it.toLowerCase()}
                .groupBy{it}
                .values
                .map{Pair(it[0], it.size)}
                .sortedByDescending { it.second }
    }
}