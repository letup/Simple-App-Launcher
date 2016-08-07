package com.simplemobiletools.applauncher.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.simplemobiletools.applauncher.R
import com.simplemobiletools.applauncher.extensions.viewIntent
import kotlinx.android.synthetic.main.activity_license.*

class LicenseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_license)

        license_kotlin_title.setOnClickListener {
            startActivity(viewIntent(getString(R.string.kotlin_url)))
        }
    }
}