package com.factor.dev.okhttpcyberalerts

import retrofit2.http.Body
import retrofit2.http.POST

interface NetworkService {
    @POST("api/networkinfo")
    suspend fun sendNetworkInfo(@Body networkInfo: NetworkInfo)
}