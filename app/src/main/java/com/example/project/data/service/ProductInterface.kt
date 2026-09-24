package com.example.project.data.service

import com.example.project.data.model.Product
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Part

interface ProductInterface {
    @GET("products")
    suspend fun getProduct(): Product

    @PUT("products/{id}")
    suspend fun updateProduct(@Part("id") id: Int, @Body product: Product): Product
}