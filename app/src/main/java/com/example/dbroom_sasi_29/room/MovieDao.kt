package com.example.dbroom_sasi_29.room

import androidx.room.*

@Dao
interface MovieDao {
    @Insert
    suspend fun addMovie(movie: Movie)

    @Query("SELECT * FROM movie ORDER BY id DESC")
    suspend fun getMovies(): List<Movie>

    @Query("SELECT * FROM movie WHERE id=:movie_id")
    suspend fun getMovie(movie_id: Int): List<Movie>

    @Update
    suspend fun updateMovie(movie: Movie)

    @Delete
    suspend fun deleteMovie(movie: Movie)
}