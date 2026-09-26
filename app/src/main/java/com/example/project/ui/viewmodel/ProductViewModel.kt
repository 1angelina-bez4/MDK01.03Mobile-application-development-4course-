package com.example.project.ui.viewmodel

import android.content.ContentValues
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.project.data.RetrofitClient
import com.example.project.data.model.Product
import kotlinx.coroutines.launch
import kotlinx.coroutines.launch

class ProductViewModel: ViewModel() {

    fun updateProduct(){
        viewModelScope.launch {
            try {
                val product = RetrofitClient.productAPI.getProducts(48)
                    Log.d("ProductViewModel", "${product.id}\n$" +
                            "${product.title}\n${product.description}\n" +
                            "${product.category}\n${product.tags}")

                val tags = listOf("Наушники", "bluetooth","шумоподавление", "беспроводные наушники", "гаджеты")
                val newProduct = product.copy(
                    title = "Беспроводные наушники SoundWave Pro",
                    description = "Наушники с активным шумоподавлением, влагозащитой IPX4 и автономностью до 30 часов работы вместе с кейсом",
                    category = "Аудиотехника",
                    tags = tags
                )

                if(newProduct.id !=null){
                    Log.d("ProductViewModel", "После редактирования")
                    Log.d("ProductViewModel", "${newProduct.id}\n$" +
                            "${newProduct.title}\n${newProduct.description}\n" +
                            "${newProduct.category}\n${newProduct.tags}")
                }

            }catch (e: Exception)
            {
                Log.e("ProductViewModel","${e.message}", e)
            }
        }
    }

}