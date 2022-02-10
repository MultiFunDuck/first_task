package com.testtasks.test

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ApplicationTests {

    @Autowired
    private lateinit var controller: Controller

    @Test
    fun contextLoads() {

        val rightSpell = listOf("кровать","кровати","кровати","кровать","кроватью","кровати")
        assertEquals(rightSpell,controller.get_all_spellings("кровать"))
    }

}
