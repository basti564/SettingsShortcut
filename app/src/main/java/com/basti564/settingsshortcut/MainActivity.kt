package com.basti564.settingsshortcut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intentSettings = Intent()
        intentSettings.setPackage("com.android.settings")
        intentSettings.addCategory(Intent.CATEGORY_LAUNCHER)
        startActivity(intentSettings)
        super.finish()
    }
}