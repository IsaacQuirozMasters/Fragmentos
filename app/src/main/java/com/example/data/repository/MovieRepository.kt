package com.example.data.repository

import com.example.data.Local.dao.MovieDao
import com.example.data.remote.RemoteDataSource
import java.time.chrono.ChronoLocalDate
import javax.inject.Inject

class MovieRepository @Inject constructor(
    private val localDataSource: MovieDao,
    private val remoteDataSource: RemoteDataSource){

    fun getPopularMovies() = performGetOperation(
        databaseQuery = { localDataSource.getAllMovies()}
    )
}