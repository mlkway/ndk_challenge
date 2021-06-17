package com.raywenderlich.ndk_challenge.ui.registrationscreen

import android.util.Log
import android.util.Log.d
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.raywenderlich.ndk_challenge.network.RetrofitService
import com.raywenderlich.ndk_challenge.user.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class RegistrationViewModel : ViewModel() {





    fun registration(email: String, password: String) {

        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                val data = RetrofitService.userService.signUp(User(email, password))
                    d("body", data.body().toString())

            }

        }

    }
}