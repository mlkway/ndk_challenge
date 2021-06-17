package com.raywenderlich.ndk_challenge.user.tokens

data class UserResponse(
    val idToken: String?,
    val email: String?,
    val refreshToken: String?,
    val expiresIn  :String?,
    val localid:String?
) {
}