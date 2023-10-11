package com.seunghun.demo

import jakarta.persistence.Entity
import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "Post")
data class Post(
        @Id
        @GeneratedValue
        @Column(name = "id")
        var id: Int = 0,
        @Column(name = "title")
        var title: String = "",
        @Column(name = "content")
        var content: String = "",
)