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
import com.example.project.data.model.Product
import com.example.project.data.model.Todo
import com.example.project.ui.theme.ProjectTheme
import com.example.project.ui.viewmodel.PostViewModel
import com.example.project.ui.viewmodel.ProductViewModel
import com.example.project.ui.viewmodel.TodoViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            val postViewModel: PostViewModel = viewModel()
//            val todoViewModel: TodoViewModel = viewModel()
//            val todo = Todo(
//                todo = "Пропылесосить ковер",
//                completed = false,
//                userId = 31
//            )
            //todoViewModel.createTodos(todo)
            //postViewModel.fetch()

            val productViewModel: ProductViewModel = viewModel()
            val tags = listOf("Наушники", "bluetooth","шумоподавление", "беспроводные наушники", "гаджеты")
            val product = Product(
                id = 48,
                title = "Беспроводные наушники SoundWave Pro",
                description = "Наушники с активным шумоподавлением, влагозащитой IPX4 и автономностью до 30 часов работы вместе с кейсом",
                category = "Аудиотехника",
                tags = tags

            )
            productViewModel.fetch(id = 48)
            productViewModel.updateProduct(id = 48,product)

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