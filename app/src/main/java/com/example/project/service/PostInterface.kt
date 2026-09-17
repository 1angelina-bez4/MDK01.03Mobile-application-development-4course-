package com.example.project.service

import com.example.project.model.PostResponse
import retrofit2.http.GET

interface PostInterface {
    @GET("posts")
    suspend fun getPosts(): PostResponse
}