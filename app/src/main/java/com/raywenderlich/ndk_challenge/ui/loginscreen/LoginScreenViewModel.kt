package com.raywenderlich.ndk_challenge.ui.loginscreen

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.raywenderlich.ndk_challenge.network.RetrofitService
import com.raywenderlich.ndk_challenge.user.User
import com.raywenderlich.ndk_challenge.user.tokens.signInResponse.SignInResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class LoginScreenViewModel : ViewModel() {

    private var _isSuccses = MutableLiveData<Boolean>()

    val isSuccses: LiveData<Boolean> get() = _isSuccses



    fun login(email:String, password:String){

        viewModelScope.launch {
            withContext(Dispatchers.IO){
              val data = RetrofitService.userService.signIn(User(email,password))
                Log.d("body", data.body().toString())

                if (data.isSuccessful){
                    Log.d("body", data.body().toString())
                    _isSuccses.postValue(true)
                }else{
                    Log.d("body", data.body().toString())
                    _isSuccses.postValue(false)
                }
            }

        }
    }




}