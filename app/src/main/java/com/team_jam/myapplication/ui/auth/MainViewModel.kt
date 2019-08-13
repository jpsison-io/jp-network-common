package com.team_jam.myapplication.ui.auth

import com.team_jam.myapplication.data.repository.UserRepo

class MainViewModel (val userRepo: UserRepo) {

    fun getUsers() = userRepo.getUsers()
}