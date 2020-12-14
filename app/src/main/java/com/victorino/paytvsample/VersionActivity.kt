package com.victorino.paytvsample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_version.*

class VersionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_version)
        versionButton.setOnClickListener{
            Toast.makeText(this,"CHAMAR USE CASE AQUI", Toast.LENGTH_SHORT).show()
        }
    }
}