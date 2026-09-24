package com.example.project.ui.viewmodel

import android.content.ContentValues
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.project.data.RetrofitClient
import kotlinx.coroutines.launch
import kotlinx.coroutines.launch

class ProductViewModel: ViewModel() {

    fun fetch(){
        viewModelScope.launch {
            try {
                val productResponse = RetrofitClient.productAPI.getProduct()
//                val products = productResponse.
//                for (product in productResponse)
//                {
//                    Log.d("ProductViewModel", "${product.}")
//                }

            }catch (e: Exception)
            {
                Log.e("ProductViewModel","${e.message}", e)
            }
        }
    }
}