package com.example.project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.project.data.model.Todo
import com.example.project.ui.theme.ProjectTheme
import com.example.project.ui.viewmodel.PostViewModel
import com.example.project.ui.viewmodel.TodoViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val postViewModel: PostViewModel = viewModel()
            val todoViewModel: TodoViewModel = viewModel()
            val todo = Todo(
                todo = "Пропылесосить ковер",
                completed = false,
                userId = 31
            )

            todoViewModel.createTodos(todo)
            //postViewModel.fetch()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProjectTheme {
        Greeting("Android")
    }
}