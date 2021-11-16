package com.magicnumber.application

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Created by Rahul Yadav on 23-08-2021.
 */
@HiltAndroidApp
class MagicNumberApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}