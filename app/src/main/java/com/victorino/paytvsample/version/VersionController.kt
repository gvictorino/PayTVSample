package com.victorino.paytvsample.version

import androidx.lifecycle.ViewModel
import com.victorino.version.domain.VersionContracts

class VersionController(private val getVersion: VersionContracts.GetVersion) : ViewModel() {
    fun onClickVersion() : String?{
        return getVersion()
    }
}