package com.victorino.paytvsample.version

import android.app.Application
import com.victorino.paytvsample.BuildConfig

class PayTVSampleApplication() : Application() {
    override fun onCreate() {
        super.onCreate()
        Version.init(this)
            .invoke(BuildConfig.VERSION_NAME)
    }
}