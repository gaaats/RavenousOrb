package com.superplusgames.hosandroi.ottther

import com.superplusgames.hosandroi.ottther.cllllaaas.CountryCodeJS
import com.superplusgames.hosandroi.ottther.cllllaaas.GeoDev
import retrofit2.Response
import retrofit2.http.GET

interface ServiceApi {

    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun getData(): Response<CountryCodeJS>

    @GET("cosik.json")
    suspend fun getDataDev(): Response<GeoDev>
}


