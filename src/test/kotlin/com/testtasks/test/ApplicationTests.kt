package com.testtasks.test

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ApplicationTests {

    @Test
    fun contextLoads() {
        assertEquals("кровать", spell("кровать")[0])
        assertEquals("кровати", spell("кровать")[1])
        assertEquals("кровати", spell("кровать")[2])
        assertEquals("кровать", spell("кровать")[3])
        assertEquals("кроватью", spell("кровать")[4])
        assertEquals("кровати", spell("кровать")[5])
    }

}
