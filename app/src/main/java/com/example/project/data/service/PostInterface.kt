package com.example.project.data.service

import com.example.project.data.model.Post
import com.example.project.data.model.PostResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface PostInterface {
    @GET("posts")
    suspend fun getPosts(): PostResponse

    @POST("posts/add")
    suspend fun addPost(@Body post: Post): Post
}