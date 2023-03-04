package com.example.ui

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.data.entities.MovieEntity
import com.example.data.repository.MovieRepository
import com.example.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PopularViewModel @Inject constructor(repository: MovieRepository): ViewModel {
    val fetchPopularMovies: LiveData<Resource<List<MovieEntity>>> = repository.getPopularMovies()
}