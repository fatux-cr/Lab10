package com.example.lab10.data
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface SerieApiService {
    @GET("products")
    suspend fun selectSeries(): ArrayList<SerieModel>

    @GET("products/{id}")
    suspend fun selectSerie(@Path("id") id: String): Response<SerieModel>

    @Headers("Content-Type: application/json")
    @POST("products")
    suspend fun insertSerie(@Body serie: SerieModel): Response<SerieModel>

    @PUT("products/{id}")
    suspend fun updateSerie(@Path("id") id: String, @Body serie: SerieModel): Response<SerieModel>

    @DELETE("products/{id}")
    suspend fun deleteSerie(@Path("id") id: String): Response<SerieModel>
}
