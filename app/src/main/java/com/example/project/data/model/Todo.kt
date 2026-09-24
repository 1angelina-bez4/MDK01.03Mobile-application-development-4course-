package com.example.project.data.model

data class Todo(
    val id: Int? = null,
    val todo: String,
    val completed: Boolean,
    val userId: Int //поле обязательно для заполнения
)
