package com.example.project.data.service

import com.example.project.data.model.Todos
import retrofit2.http.Body
import retrofit2.http.POST

interface TodosInterface {

    @POST("todos/add")
    suspend fun addTodos(@Body todos: Todos): Todos
}