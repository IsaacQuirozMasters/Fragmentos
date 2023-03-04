package com.example.data.remote

import javax.inject.Inject

class RemoteDataSource @Inject constructor(){
suspend fun getPopularMovies() = getResult{apiServices.getPopularMovies(Const.API_KEY)} //pendiente
}