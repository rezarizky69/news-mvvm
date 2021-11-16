package com.eja.newsmvvm.models

// data class that represent the response of the news
data class NewsResponse(
    // list of articles
    val articles: MutableList<Article>,
    // the status
    val status: String,
    // and total amount of result
    val totalResults: Int
)