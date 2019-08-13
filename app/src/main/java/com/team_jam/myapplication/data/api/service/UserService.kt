package com.team_jam.myapplication.data.api.service

import com.team_jam.myapplication.data.model.User
import retrofit2.Call
import retrofit2.http.GET


interface UserService {

    @GET("users")
    fun getUsers(): Call<List<User>>
}