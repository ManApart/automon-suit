import org.junit.Assert.assertEquals
import org.junit.Test

class DoubleListTest {


    @Test
    fun basicItems() {
        val numbers = createList(2)
        println(numbers)
        assertEquals("00", numbers[0][0])
        assertEquals("10", numbers[1][0])
        assertEquals("01", numbers[0][1])
        assertEquals("11", numbers[1][1])
    }


    private fun createList(xMax: Int, yMax: Int = xMax): List<List<String>> {
        val numbers = mutableListOf<MutableList<String>>()
        for (x in 0 until xMax) {
            val column = mutableListOf<String>()
            for (y in 0 until yMax) {
                column.add("$x$y")
            }
            numbers.add(column)
        }
        return numbers
    }
}