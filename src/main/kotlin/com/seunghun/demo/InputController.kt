package com.seunghun.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody

@RestController
class InputController {
    @GetMapping("/input/{word}")
    fun print(@PathVariable word: String) {
        println(word)
    }

    @PostMapping("/data")
    fun data(@RequestBody data: Data) {
        println("POST Request Received: " + data.title + " " + data.value)
    }
}

class Data {
    var title: String? = null
    var value: Int? = null
}