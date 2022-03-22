package lesson6.task1.tests22

import junit.framework.Assert
import lesson5.task1.findSumOfTwo
import lesson6.task1.firstDuplicateIndex
import org.junit.Test
import org.junit.jupiter.api.Assertions

class FirstDuplicateIndex {
    @Test
    fun testFirstDuplicateIndex() {
        Assertions.assertEquals(0, firstDuplicateIndex("И и привет как дела"))
        Assertions.assertEquals(-1, firstDuplicateIndex("Я люблю мир"))
        Assertions.assertEquals(-1, firstDuplicateIndex("Универ универр"))
        Assertions.assertEquals(2, firstDuplicateIndex("Я делаю делаю тесты"))
        Assertions.assertEquals(-1, firstDuplicateIndex("Привет как дела"))
        Assertions.assertEquals(10, firstDuplicateIndex("а б в г д е е"))
        Assertions.assertEquals(10, firstDuplicateIndex("мама мыла милу милу милу"))
        Assertions.assertEquals(0, firstDuplicateIndex("а А б в г"))

    }
}