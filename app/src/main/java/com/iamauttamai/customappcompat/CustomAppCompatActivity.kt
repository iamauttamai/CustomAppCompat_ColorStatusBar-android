package com.iamauttamai.customappcompat

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by AuttaphonL. on 08,June,2023
 */

open class CustomAppCompatActivity : AppCompatActivity() {

    protected var color: String = "#21C80A"

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setColorStatusBar()
    }

    override fun onResume() {
        setColorStatusBar(color)
        super.onResume()
    }

    open fun setColorStatusBar() {
        if (color == null) return
        setColorStatusBar(Color.parseColor(color))
    }

    open fun setColorStatusBar(color: String?) {
        if (color == null) return
        setColorStatusBar(Color.parseColor(color))
    }

    @SuppressLint("ResourceAsColor")
    open fun setColorStatusBar(color: Int) {
        val window = window
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        // add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        // finally change the color
        window.statusBarColor = color
    }

}