package com.team_jam.networkcommon.utils

class Resource<T>(
    val status: Status,
    val data: T?,
    val title: String?,
    val message: String?
) {

    companion object {

        fun <T> success(data: T?): Resource<T> {
            return Resource(
                Status.SUCCESS,
                data,
                null,
                null
            )
        }

        fun <T> error(title: String?, message: String?): Resource<T> {
            return Resource(
                Status.ERROR,
                null,
                title,
                message
            )
        }

        fun <T> loading(): Resource<T> {
            return Resource(
                Status.LOADING,
                null,
                null,
                null
            )
        }
    }
}