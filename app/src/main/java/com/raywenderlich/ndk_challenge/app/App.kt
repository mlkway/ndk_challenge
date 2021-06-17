package com.raywenderlich.ndk_challenge.app

import android.app.Application

class App:Application() {

    override fun onCreate() {
        super.onCreate()
        key = stringFromJNI()

    }


    external fun stringFromJNI(): String



    companion object {
        // Used to load the 'native-lib' library on application startup.
        lateinit var key:String
        init {
            System.loadLibrary("native-lib")
        }
    }

}