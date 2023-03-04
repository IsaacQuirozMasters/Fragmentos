package com.example.utils

abstract class BaseDataSource {
    protected suspend fun <T> getResult(call: suspend ())
    try{
        val response = call()
        if(response.isSuccessful) {
            val body = response.body()
            if(body != null) return Resource.success(body)

        }
        return error("${response.code()} ${response.message}")
    } catch (e: Exeption){
        return error(e.message ?: e:toString))}
}