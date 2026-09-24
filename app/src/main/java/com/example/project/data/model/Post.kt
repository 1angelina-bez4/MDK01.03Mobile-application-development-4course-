package com.example.project.data.model

import  com.example.project.data.model.Reactions

data class Post(
    val id: Int? = null,
    val title: String,
    val body: String,
    val reactions: Reactions,
    val userId: Int
)
