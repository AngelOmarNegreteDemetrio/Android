package com.example.prueba.data.model.network


import com.example.prueba.data.model.ServiceModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.*

interface ApiService {
    @GET("service")
    suspend fun getServices(): Response<List<ServiceModel>>

    @GET("service/{id}")
    suspend fun getServices(@Path("id") id: Int): Response<ServiceModel>

    @POST("Service")
    suspend fun createService(@Body service: ServiceModel): Response<ServiceModel>

    @PUT("Service/{id}")
    suspend fun updateService(
        @Path("id") id: Int,
        @Body service: ServiceModel
    ): Response<ServiceModel>

    @DELETE("Service/{id}")
    suspend fun deleteService(@Path("id") id: Int): Response<ServiceModel>

}