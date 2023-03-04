package com.example.data.Local.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.data.entities.MovieEntity
import retrofit2.http.Query
@Dao
interface MovieDao {
    @Query("SELECT * FROM movieEntity WHERE movie_type = :movieType")
    fun getAllMovies(movieType:Int): LiveData<List<MovieEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(characters: List<MovieEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(movieEntity: MovieEntity)
}