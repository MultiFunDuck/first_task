package com.testtasks.test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.bind.annotation.*
import padeg.lib.Padeg


@SpringBootApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}

@Bean
fun spell(word: String): List<String> {
    val first_pad: String = Padeg.getAppointmentPadeg(word, 1);
    val second_pad: String = Padeg.getAppointmentPadeg(word, 2);
    val third_pad: String = Padeg.getAppointmentPadeg(word, 3);
    val fourth_pad: String = Padeg.getAppointmentPadeg(word, 4);
    val fifth_pad: String = Padeg.getAppointmentPadeg(word, 5);
    val sixth_pad: String = Padeg.getAppointmentPadeg(word, 6);

    return listOf(first_pad, second_pad, third_pad, fourth_pad, fifth_pad, sixth_pad)
}

@RestController
@RequestMapping("spell/{word}")
class Controller{
    @GetMapping

    fun get_all_spellings(@PathVariable("word") word : String): List<String>{
        return spell(word)
    }
}