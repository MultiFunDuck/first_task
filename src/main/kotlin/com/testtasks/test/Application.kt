package com.testtasks.test

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.*
import padeg.lib.Padeg


@SpringBootApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}


@Service
class Speller{


    fun spell(word: String): List<String> {
        return List(6) { i -> Padeg.getAppointmentPadeg(word, i+1) }
    }

}



@RestController
@RequestMapping("spell/{word}")
class Controller{

    @Autowired
    private lateinit var speller: Speller

    @GetMapping
    fun get_all_spellings(@PathVariable("word") word : String): List<String>{
        return speller.spell(word)
    }

}