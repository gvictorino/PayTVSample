package com.victorino.paytvsample.version

import androidx.lifecycle.ViewModel
import com.victorino.version.domain.VersionContract

class VersionController(private val versionContract: VersionContract) : ViewModel() {
    fun onClickVersion() : String?{
        return versionContract.getVersion()
    }
}