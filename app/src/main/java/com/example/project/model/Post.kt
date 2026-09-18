package com.example.project.model

data class Post(
    val id: Int? = null,
    val title: String,
    val body: String,
    val reactions: Reactions,
    val userId: Int
)
