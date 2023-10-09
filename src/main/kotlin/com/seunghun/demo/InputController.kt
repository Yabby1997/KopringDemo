package com.seunghun.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable

@RestController
class InputController {
    @GetMapping("/input/{word}")
    fun print(@PathVariable word: String) {
        println(word)
    }
}