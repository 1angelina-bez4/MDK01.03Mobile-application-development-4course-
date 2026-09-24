package com.example.project.data.service

import com.example.project.data.model.Todo
import retrofit2.http.Body
import retrofit2.http.POST

interface TodoInterface {

    @POST("todos/add")
    suspend fun addTodo(@Body todo: Todo): Todo
}