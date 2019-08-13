package com.team_jam.myapplication.data.repository

import androidx.lifecycle.LiveData
import com.team_jam.myapplication.data.api.service.UserService
import com.team_jam.myapplication.data.model.User
import com.team_jam.networkcommon.utils.NetworkResource
import com.team_jam.networkcommon.utils.Resource
import retrofit2.Call

class UserRepoImpl (val userService: UserService): UserRepo {

    override fun getUsers(): LiveData<Resource<List<User>>> {

        return object : NetworkResource<List<User>>() {

            override fun call(): Call<List<User>> = userService.getUsers()

        }.run().toLiveData()
    }

}