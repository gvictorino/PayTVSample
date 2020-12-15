package com.victorino.paytvsample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.victorino.version.domain.VersionContract

class VersionControllerFactory(private val versionContract: VersionContract) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return VersionController(versionContract) as T
        }
}