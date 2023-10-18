package com.example.retrofitapi

import retrofit2.http.GET

interface MyInterface {
    @GET("/quotes")
    suspend fun getQuotes():retrofit2.Response<QuoteList>
}