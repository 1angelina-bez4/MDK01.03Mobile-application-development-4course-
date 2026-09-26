package com.example.project.data.service

import com.example.project.data.model.Product
import com.example.project.data.model.ProductResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Part
import retrofit2.http.Path

interface ProductInterface {
    @GET("products/{id}")
    suspend fun getProducts(@Path("id") id: Int): Product

    @PUT("products/{id}")
    suspend fun updateProduct(@Path("id") id: Int, @Body product: Product): Product

    @DELETE("products/{id}")
    suspend fun deletedProduct(@Path("id") id: Int): Product
}