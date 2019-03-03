package com.example.sharedpreference

import android.app.Application
import com.example.sharedpreference.data.preferenceHelper

class App : Application() {

companion object {
    lateinit var preference : preferenceHelper
}

    override fun onCreate() {
        super.onCreate()
        preference = preferenceHelper(applicationContext)
    }
}