package com.example.project.model

data class Todos(
    val id: Int? = null,
    val todo: String,
    val completed: Boolean,
    val userId: Int //поле обязательно для заполнения
)
