package com.raywenderlich.ndk_challenge.network

import com.raywenderlich.ndk_challenge.app.App
import com.raywenderlich.ndk_challenge.user.User
import com.raywenderlich.ndk_challenge.user.tokens.UserResponse
import com.raywenderlich.ndk_challenge.user.tokens.signInResponse.SignInResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query

interface UserService {


    @POST("v1/accounts:signUp?")
    suspend fun signUp(
        @Body user: User,
        @Query("key") key : String = App.key
    ):Response<UserResponse>



    @POST("v1/accounts:signInWithPassword?")
    suspend fun signIn(
        @Body user: User,
        @Query("key") key: String = App.key
    ):Response<SignInResponse>

}