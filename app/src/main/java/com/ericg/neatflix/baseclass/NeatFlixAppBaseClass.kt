package com.ericg.neatflix.baseclass

import android.app.Application
import com.facebook.stetho.Stetho
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class NeatFlixAppBaseClass : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        Stetho.initializeWithDefaults(this)

        Timber.i("Initialized Timber and Stetho")
    }
}