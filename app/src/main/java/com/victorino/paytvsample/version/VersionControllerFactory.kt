package com.victorino.paytvsample.version

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.victorino.version.domain.VersionContracts

class VersionControllerFactory(private val getVersion: VersionContracts.GetVersion) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return VersionController(
                getVersion
            ) as T
        }
}