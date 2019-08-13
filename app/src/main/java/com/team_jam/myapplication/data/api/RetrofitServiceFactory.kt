package com.team_jam.myapplication.data.api

import com.team_jam.myapplication.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitServiceFactory {

    val interceptor = HttpLoggingInterceptor()

    init {
        if (BuildConfig.DEBUG) {
//            interceptor.level = HttpLoggingInterceptor.Level.BODY
        }
    }

    val client = OkHttpClient.Builder()
        .addInterceptor(interceptor).build()

    var retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com")
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    fun <T>getService(clazz: Class<T>): T {
        return retrofit.create(clazz)
    }
}