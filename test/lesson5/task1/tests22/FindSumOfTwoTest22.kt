package lesson5.task1.tests22

import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
import lesson5.task1.canBuildFrom
import lesson5.task1.findSumOfTwo
import org.junit.Test

class FindSumOfTwoTest22 {
    @Test
    fun testFindSumOfTwo() {
        assertEquals(findSumOfTwo(listOf(1, 2, 3), 4), Pair(0, 2))
        assertEquals(findSumOfTwo(listOf(1, 2, 3), 6), Pair(-1, -1))
        assertEquals(findSumOfTwo(listOf(0, 1, 3), 5), Pair(-1, -1))
        assertEquals(findSumOfTwo(listOf(5, 1, 0), 6), Pair(0, 1))

    }
}



