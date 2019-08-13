package com.team_jam.networkcommon.utils

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

abstract class NetworkResource<T> {

    val request = MutableLiveData<Resource<T>>()

    abstract fun call(): Call<T>

    fun run(): NetworkResource<T> {
        request.postValue(Resource.loading())
        call().enqueue(object : Callback<T> {
            override fun onFailure(call: Call<T>, t: Throwable) {
                request.postValue(Resource.error(t.message, t.message))
            }

            override fun onResponse(call: Call<T>, response: Response<T>) {
                request.postValue(Resource.success(response.body()))
            }

        })
        return this
    }

    fun toLiveData() = request as LiveData<Resource<T>>
}