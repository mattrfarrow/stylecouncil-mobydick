import mobydick.Main
import org.junit.Assert
import org.junit.Test


class TestStuff {

    @Test
    fun testIt(){
        val text = javaClass.getResource("moby_dick_no_punctuation.txt").readText()
        val wordCounts = Main.wordCounts(text)

        Assert.assertEquals(wordCounts[0], Pair("the", 14440))
        Assert.assertEquals(wordCounts[1], Pair("of", 6653))
        Assert.assertEquals(wordCounts[2], Pair("and", 6398))
        Assert.assertEquals(wordCounts[3], Pair("a", 4673))
        Assert.assertEquals(wordCounts[4], Pair("to", 4620))
    }

}