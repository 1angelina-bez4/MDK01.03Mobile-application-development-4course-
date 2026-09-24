package com.example.project.data

import com.example.project.data.service.PostInterface
import com.example.project.data.service.ProductInterface
import com.example.project.data.service.TodoInterface
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.InetSocketAddress
import java.net.Proxy

object RetrofitClient {

    val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY

    }

    //val proxy = Proxy(Proxy.Type.HTTP, InetSocketAddress("10.207.106.59", 3128))

    val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        //.proxy(proxy)
        .build()

    val retrofit = Retrofit.Builder()
        .baseUrl("https://dummyjson.com/")
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val retrofitAPI: PostInterface = retrofit.create(PostInterface::class.java)
    val todoAPI: TodoInterface = retrofit.create(TodoInterface::class.java)

    val productAPI: ProductInterface = retrofit.create(ProductInterface::class.java)
}