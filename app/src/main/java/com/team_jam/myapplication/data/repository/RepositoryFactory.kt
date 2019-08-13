package com.team_jam.myapplication.data.repository

import com.team_jam.myapplication.data.api.RetrofitServiceFactory
import com.team_jam.myapplication.data.api.service.UserService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RepositoryFactory {

    var retrofitServiceFactory = RetrofitServiceFactory()

    val userRepo: UserRepo
        get() = UserRepoImpl(retrofitServiceFactory.getService(UserService::class.java))
}