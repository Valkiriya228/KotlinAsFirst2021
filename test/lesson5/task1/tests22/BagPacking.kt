package lesson5.task1.tests22


import junit.framework.Assert.assertEquals
import lesson5.task1.bagPacking
import org.junit.Test

class BagPacking {
    @Test
    fun testBagPacking() {
        assertEquals(
            bagPacking(
                mapOf("Кубок" to (500 to 2000), "Слиток" to (1000 to 5000)),
                850
            ), setOf("Кубок")
        )
        assertEquals(
            bagPacking(
                mapOf("Кубок" to (500 to 2000), "Слиток" to (1000 to 5000)),
                450
            ), emptySet<String>()
        )

        assertEquals(
            bagPacking(
                mapOf("Кубок" to (900 to 5000), "Слиток" to (1500 to 7000)),
                2000
            ), setOf("Слиток")
        )
    }

}