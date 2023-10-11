package com.seunghun.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestBody

@RestController
@RequestMapping("/api/v1")
class PostController(
    val postRepository: PostRepository
) {
    @GetMapping("/posts")
    fun posts(): List<Post> {
        return postRepository.findAll()
    }

    @PostMapping("/post")
    fun post(@RequestBody post: Post) {
        postRepository.save(post)
    }
}