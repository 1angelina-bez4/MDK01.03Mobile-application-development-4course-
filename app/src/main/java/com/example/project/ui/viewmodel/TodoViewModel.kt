package com.example.project.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.project.data.RetrofitClient
import com.example.project.data.model.Todo
import kotlinx.coroutines.launch

class TodoViewModel: ViewModel() {

    fun createTodos(todo: Todo){
        viewModelScope.launch {
            try {
                val todo = RetrofitClient.todoAPI.addTodo(todo)
                Log.d("TodosViewModel", "${todo.id}\n${todo.todo}\n${todo.completed}\n${todo.userId}\n")

            } catch (e: Exception)
            {
                Log.e("TodosViewModel", "${e.message}", e)
            }
        }
    }
}