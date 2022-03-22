package lesson7.task1.tests22

import junit.framework.Assert.assertEquals
import org.junit.jupiter.api.Test
import java.io.File

class Sibilants {
    private fun assertFileContent(name: String, expectedContent: String) {
        val file = File(name)
        val content = file.readLines().joinToString("\n")
        assertEquals(expectedContent, content)
    }

    @Test
    fun sibilants() {
        lesson7.task1.sibilants("input/text1.txt", "temp.txt")
        assertFileContent(
            "temp.txt",
            "жи ши пиши с буквой и"
        )
        File("temp.txt").delete()
        lesson7.task1.sibilants("input/text2.txt", "temp.txt")
        assertFileContent(
            "temp.txt",
            "ЖИШИЧУЩУ"
        )
        File("temp.txt").delete()
        lesson7.task1.sibilants("input/text3.txt", "temp.txt")
        assertFileContent(
            "temp.txt",
            "Всем привет! Как дела?"
        )
        File("temp.txt").delete()
        lesson7.task1.sibilants("input/text4.txt", "temp.txt")
        assertFileContent(
            "temp.txt",
            "Жили были дед да баба\n" +
                    "Шиншилла\n" +
                    "Шикарно"
        )
        File("temp.txt").delete()
        lesson7.task1.sibilants("input/text5.txt", "temp.txt")
        assertFileContent(
            "temp.txt",
            "жИли пили, маШИна и машИнка"
        )
        File("temp.txt").delete()
    }
}