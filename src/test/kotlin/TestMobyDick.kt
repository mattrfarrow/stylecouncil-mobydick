
import org.junit.Assert
import org.junit.Test


class TestMobyDick {

    @Test
    fun testIt(){
        val text = javaClass.getResource("moby_dick_no_punctuation.txt").readText()
        val wordCounts = mobydick.wordCounts(text)

        Assert.assertEquals(
                wordCounts.take(5),
                listOf("the" to 14440,
                        "of" to 6653,
                        "and" to 6398,
                        "a" to 4673,
                        "to" to 4620))
    }

}