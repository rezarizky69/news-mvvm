package com.eja.newsmvvm.util

// class for identify the status of application
sealed class Resource<T>(
    // variable named data that have generic type
    val data: T? = null,
    // variable message that have string type
    val message: String? = null
) {
    // if success, take the data
    class Success<T>(data: T) : Resource<T>(data)
    // if error, take the error message and data is equal to null
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
    // if loading, don't do anything
    class Loading<T> : Resource<T>()
}