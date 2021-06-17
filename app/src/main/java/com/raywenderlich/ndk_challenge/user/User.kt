package com.raywenderlich.ndk_challenge.user

data class User(val email:String?, val password:String?, val returnSecureToker :Boolean? = true) {
}