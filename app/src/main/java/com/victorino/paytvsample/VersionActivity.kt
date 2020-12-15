package com.victorino.paytvsample

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_version.*
import java.lang.ref.WeakReference

class VersionActivity : AppCompatActivity() {
    private val controller: VersionController by viewModels {
        VersionInjection(WeakReference(this)).buildControllerFactory()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_version)
        versionButton.setOnClickListener{
            Toast.makeText(this, controller.onClickVersion(), Toast.LENGTH_SHORT).show()
        }
    }
}