package com.iamauttamai.customappcompat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : CustomAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}