package com.example.di

import android.content.Context
import com.example.data.Local.AppDatabase
import com.example.data.remote.ApiService
import com.example.data.remote.RemoteDataSource
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.Retrofit
import javax.inject.Singleton

.addConverterFactory(GsonConverterFactory.create(gson))
.build()

object AppModule {

    @Singleton
    @Provides
    fun providesApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)

    @Singleton
    @Provides
    fun providesRemoteDataSource(apiService: ApiService) = RemoteDataSource(apiService)

    @Singleton
    @Provides
    fun provideDatabase(@AplicationContext appContext: Context) = AppDatabase.getDatabase(appContext)