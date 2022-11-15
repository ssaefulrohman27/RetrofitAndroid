package com.example.android.model

import android.icu.text.CaseMap


data class Article (
    val author : String,
    val source: Source,
    val content : String,
    val description : String,
    val publishedAt : String,
    val title: String,
    val url : String,
    val urlToImage : String
        )