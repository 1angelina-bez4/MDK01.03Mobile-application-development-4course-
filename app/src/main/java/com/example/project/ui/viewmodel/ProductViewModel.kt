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

    fun fetch(id:Int){
        viewModelScope.launch {
            try {
                val product = RetrofitClient.productAPI.getProducts(id)
                    Log.d("ProductViewModel", "${product.id}\n$" +
                            "${product.title}\n${product.description}\n" +
                            "${product.category}\n${product.tags}")
//                val product= RetrofitClient.productAPI.updateProduct(id,product)
//
//                if(id !=null){
//                    Log.d("ProductViewModel", "после редактирования")
//                    Log.d("ProductViewModel", "${product.id}\n$" +
//                            "{product.title}\n${product.description}\n" +
//                            "${product.category}\n${product.tags}")
//                }

            }catch (e: Exception)
            {
                Log.e("ProductViewModel","${e.message}", e)
            }
        }
    }

    fun updateProduct(id:Int ,product: Product){
        viewModelScope.launch {
            try{
                val product= RetrofitClient.productAPI.updateProduct(id,product)

                if(id !=null){
                    Log.d("ProductViewModel", "после редактирования")
                    Log.d("ProductViewModel", "${product.id}\n$" +
                            "${product.title}\n${product.description}\n" +
                            "${product.category}\n${product.tags}")
                }
            }
            catch (e: Exception)
            {
                Log.e("ProductViewModel","${e.message}", e)
            }
        }
    }
}