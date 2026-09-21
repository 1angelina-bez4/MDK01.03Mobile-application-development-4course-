package com.example.project.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.project.data.RetrofitClient
import com.example.project.data.model.Todos
import kotlinx.coroutines.launch

class TodosViewModel: ViewModel() {

    fun createTodos(todos: Todos){
        viewModelScope.launch {
            try {
                val todos = RetrofitClient.todosAPI.addTodos(todos)
                Log.d("TodosViewModel", "${todos.id}\n${todos}\n${todos.completed}\n${todos.userId}\n")

            } catch (e: Exception)
            {
                Log.e("TodosViewModel", "${e.message}", e)
            }
        }
    }
}