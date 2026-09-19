package com.example.project

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.project.model.Todos
import kotlinx.coroutines.launch

class TodosViewModel: ViewModel() {

    fun createTodos(todos: Todos){
        viewModelScope.launch {
            try {
                val todos = RetrofitClient.todosAPI.addTodos(todos)
                Log.d("TodosViewModel", "${todos.id}\n${todos.todo}\n${todos.completed}\n${todos.userId}\n")

            } catch (e: Exception)
            {
                Log.e("TodosViewModel", "${e.message}", e)
            }
        }
    }
}