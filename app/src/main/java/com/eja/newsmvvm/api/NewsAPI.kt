package com.eja.newsmvvm.api

import com.eja.newsmvvm.models.NewsResponse
import com.eja.newsmvvm.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

// an interface that contain all the function that will be called via retrofit
interface NewsAPI {

    // get the breaking news
    // first, get the base url
    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        // the take country parameter into us
        @Query("country")
        countryCode: String = "us",
        // the page number is 1
        @Query("page")
        pageNumber: Int = 1,
        // and use the api key in constants
        @Query("apiKey")
        apiKey: String = API_KEY
        // return the response of news response
    ): Response<NewsResponse>

    // get the news based from the query search
    // first, get the base url
    @GET("v2/everything")
    suspend fun searchForNews(
        // take the parameter of string
        @Query("q")
        searchQuery: String,
        // the page number is 1
        @Query("page")
        pageNumber: Int = 1,
        // and use the api key in constants
        @Query("apiKey")
        apiKey: String = API_KEY
        // return the response of news response
    ): Response<NewsResponse>
}