package com.obscura.llc.scaffoldmvvm.network.api

import com.obscura.llc.scaffoldmvvm.database.entity.SampleEntity
import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {

    @GET("/todos")
    fun getSampleData(): Single<List<SampleEntity>>

}