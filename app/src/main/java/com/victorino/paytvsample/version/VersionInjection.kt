package com.victorino.paytvsample.version

import android.app.Activity
import com.victorino.paytvsample.PayTVSampleConstants.APP_IDENTIFIER
import com.victorino.paytvsample.PayTVSampleConstants.SHARED_PREFERENCE_NAME
import com.victorino.version.builders.VersionUseCaseBuilder
import java.lang.ref.WeakReference

class VersionInjection(private val activity: WeakReference<Activity>) {
    fun buildControllerFactory(): VersionControllerFactory {
        activity.get()?.let {
            val versionUseCase = VersionUseCaseBuilder().apply {
                setSharedPreferences(
                    it.getSharedPreferences(SHARED_PREFERENCE_NAME, 0)
                )
                setAppIdentifier(APP_IDENTIFIER)
            }
            return VersionControllerFactory(versionUseCase.buildGetVersion())
        } ?: throw NullPointerException("Fragment is null")
    }
}
