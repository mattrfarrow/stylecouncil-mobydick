package mobydick

import java.io.File

fun main(args: Array<String>) {
    val filename = args[0]
    val text = File(filename).readText()
    wordCounts(text).forEach {
        println(it.first + ": " + it.second)
    }
}

fun wordCounts(text: String): List<Pair<String,Int>> {
    val delimiters = arrayOf(" ", "\n")
    val words = text.split(*delimiters)
    return words
            .map { it.toLowerCase() }
            .groupBy { it }
            .values
            .map { Pair(it[0], it.size) }
            .sortedByDescending { it.second }
}