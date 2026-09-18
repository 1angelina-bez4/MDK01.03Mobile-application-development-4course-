package com.example.project.service

import com.example.project.model.Post
import com.example.project.model.PostResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface PostInterface {
    @GET("posts")
    suspend fun getPosts(): PostResponse

    @POST("posts/add")
    suspend fun addPost(@Body post: Post): Post
}