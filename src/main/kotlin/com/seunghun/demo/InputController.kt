package com.seunghun.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestBody

@RestController
@RequestMapping("/api/v1")
class InputController {
    @GetMapping("/input/{word}")
    fun input(@PathVariable word: String) {
        println(word)
    }

    @PostMapping("/data")
    fun data(@RequestBody data: Data) {
        println("POST Request Received: " + data.title + " " + data.value)
    }
}

@RestController
@RequestMapping("/api/v2")
class InputController2 {
    @GetMapping("/input/{word}")
    fun input(@PathVariable word: String) {
        println("V2: " + word)
    }
}

class Data {
    var title: String? = null
    var value: Int? = null
}