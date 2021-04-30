package com.dendi.filmscatalogs.data.source.remote.network

import com.dendi.filmscatalogs.BuildConfig
import com.dendi.filmscatalogs.data.source.remote.response.MovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("trending/movie/week")
    fun getMovies(
        @Query("api_key") apiKey: String = BuildConfig.TOKEN
    ): Call<MovieResponse>
}