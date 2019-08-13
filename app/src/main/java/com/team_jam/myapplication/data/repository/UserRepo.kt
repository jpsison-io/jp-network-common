package com.team_jam.myapplication.data.repository

import androidx.lifecycle.LiveData
import com.team_jam.myapplication.data.model.User
import com.team_jam.networkcommon.utils.Resource

interface UserRepo {

    fun getUsers(): LiveData<Resource<List<User>>>
}