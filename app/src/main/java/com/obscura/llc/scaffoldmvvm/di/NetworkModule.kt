package com.obscura.llc.scaffoldmvvm.di

import androidx.annotation.Keep
import com.obscura.llc.scaffoldmvvm.BuildConfig
import com.obscura.llc.scaffoldmvvm.network.api.ApiService
import com.obscura.llc.scaffoldmvvm.network.communicator.Communicator
import com.obscura.llc.scaffoldmvvm.network.communicator.ServerCommunicator
import okhttp3.ConnectionPool
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

@Keep
val networkModule = module {
    single {
        OkHttpClient.Builder()
            .connectionPool(ConnectionPool(5, 30, TimeUnit.SECONDS))
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .apply {
                if (BuildConfig.DEBUG) addInterceptor(
                    HttpLoggingInterceptor().apply {
                        level = HttpLoggingInterceptor.Level.BODY
                    }
                )
            }
            .build()
    }

    single<Retrofit.Builder> {
        Retrofit.Builder()
            .client(get())
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
    }

    single {
        get<Retrofit.Builder>()
            .baseUrl(BuildConfig.API)
            .build()
            .create(ApiService::class.java)
    }

    single<Communicator> {
        ServerCommunicator(get())
    }
}