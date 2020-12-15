package com.victorino.paytvsample.version

import android.content.Context
import com.victorino.paytvsample.PayTVSampleConstants
import com.victorino.version.builders.VersionUseCaseBuilder
import com.victorino.version.domain.VersionContracts

interface Version {
    companion object {
        fun init(context: Context): VersionContracts.SetVersion {
            val versionUseCase = VersionUseCaseBuilder().apply {
                setSharedPreferences(
                    context.getSharedPreferences(PayTVSampleConstants.SHARED_PREFERENCE_NAME, 0)
                )
                setAppIdentifier(PayTVSampleConstants.APP_IDENTIFIER)
            }
            return versionUseCase.buildSetVersion()
        }
    }
}