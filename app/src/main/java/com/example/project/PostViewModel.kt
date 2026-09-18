package com.example.project

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.project.model.Post
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
                    Log.d("PostViewModel","${post.title}\n${post.body}\n${post.reactions.likes}\n${post.reactions.dislikes}")
                }

            } catch (e: Exception)
            {
                Log.e(TAG,"${e.message}", e)
            }
        }
    }

    fun createPost(post: Post){
        viewModelScope.launch {
            try {
                val post = RetrofitClient.retrofitAPI.addPost(post)

                //Вывод поста в одной строке
                Log.d("PostViewModel","${post.title}\n${post.body}\n${post.reactions.likes}\n${post.reactions.dislikes}")

            } catch (e: Exception)
            {
                Log.e(TAG,"${e.message}", e)
            }
        }
    }
}