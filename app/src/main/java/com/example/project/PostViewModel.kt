package com.example.project

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class PostViewModel: ViewModel() {
     fun fetch(){
        viewModelScope.launch {
            try {
                val postResponse = RetrofitClient.retrofitAPI.getPosts()
                val posts = postResponse.posts
                for (post in posts)
                {
                    //Вывод поста в одной строке
                    Log.d("PostViewModel","${post.title} | ${post.body} | ${post.reactions.likes} | ${post.reactions.dislikes}")
                    //Вывод построчно
                    //Log.d("PostViewModel","${post.title}")
                    //Log.d("PostViewModel","${post.body}")
                    //Log.d("PostViewModel","${post.reactions.likes}")
                    //Log.d("PostViewModel","${post.reactions.dislikes}")
                }

            } catch (e: Exception)
            {
                Log.e(TAG,"${e.message}", e)
            }
        }
    }
}