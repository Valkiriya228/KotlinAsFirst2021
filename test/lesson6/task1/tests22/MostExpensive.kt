package lesson6.task1.tests22


import junit.framework.Assert.assertEquals
import lesson6.task1.mostExpensive
import org.junit.Test
import org.junit.jupiter.api.Assertions

class MostExpensive {
    @Test
    fun mostExpensive() {
        assertEquals("", mostExpensive(""))
        assertEquals(
            "Хлеб", mostExpensive("Хлеб 36.6; Молоко 36.5; Курица 10.45; Конфеты 11.5")
        )
        assertEquals("Молоко", mostExpensive("Вино 0.0; Молоко 1.0"))
        assertEquals("", mostExpensive(""))
        assertEquals(
            "Конфеты", mostExpensive("Хлеб 1.6; Молоко 2.6; Курица 3.45; Конфеты 4.5")
        )
        assertEquals("Персик", mostExpensive("Яблоко 7.0; Персик 7.01"))

    }
}