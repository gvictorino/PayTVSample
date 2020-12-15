package com.victorino.paytvsample

import android.app.Activity
import com.victorino.paytvsample.PayTVSampleConstants.APP_IDENTIFIER
import com.victorino.paytvsample.PayTVSampleConstants.SHARED_PREFERENCE_NAME
import com.victorino.version.data.VersionRepositoryImpl
import com.victorino.version.domain.VersionUseCase
import java.lang.ref.WeakReference

class VersionInjection(private val activity: WeakReference<Activity>) {
    fun buildControllerFactory(): VersionControllerFactory {
        activity.get()?.let {
            val versionRepositoryImpl = VersionRepositoryImpl(
                it
                    .getSharedPreferences(
                        SHARED_PREFERENCE_NAME, 0
                    )
            )
            val versionContract = VersionUseCase(versionRepositoryImpl, APP_IDENTIFIER)
            return VersionControllerFactory(versionContract)
        } ?: throw NullPointerException("Fragment is null")
    }
}