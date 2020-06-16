package com.cengiztoru.splashscreenrightway

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Code With 💗
 * Created by Cengiz TORU
 * cengiztoru@gmail.com
 * 16/06/2020
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Make sure this is before calling super.onCreate
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}