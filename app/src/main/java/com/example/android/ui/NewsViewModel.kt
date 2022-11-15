package com.example.android.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.model.Article
import com.example.android.network.Api
import kotlinx.coroutines.launch
import kotlin.math.log

class NewsViewModel : ViewModel() {

    init {
        getListNews()
    }
    fun getListNews(){
        viewModelScope.launch {
            val response = Api.newsApiservice.getTopHeadline()
            val articles = response.articles

            articles.forEach { article : Article ->
                Log.d("Response", article.toString())
            }
        }
    }
}