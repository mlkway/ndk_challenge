package com.raywenderlich.ndk_challenge.user.tokens.signInResponse

class SignInResponse(
    val idToken: String?,
    val email: String?,
    val refreshToken: String?,
    val expiresIn  :String?,
    val localid:String?,
    val registered: Boolean?) {
}