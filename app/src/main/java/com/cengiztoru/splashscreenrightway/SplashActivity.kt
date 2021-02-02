package com.cengiztoru.splashscreenrightway

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer

/**
 * Code With 💗
 * Created by Cengiz TORU
 * cengiztoru@gmail.com
 * 02/02/2021
 */

class SplashActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        /** Some Operations like that
         * Checking Force Update
         * Checking User Login State
         * Asking Some Questions to User
         * Checking OnBoarding Screen has been shown before
         * Getting Some Data From Remote or Local
         * ...
         * */

        doSomeOperations()
    }

    private fun doSomeOperations() {
        /**
         * ...
         * ...
         * ...
         * */

        timer(1500) {   //Never give hardcoded time in real projects before showing next screen.
            // Of course, if your manager or customer don't want explicitly showing screen for a time
            operationsDoneGoNextScreen()
        }
    }

    private fun operationsDoneGoNextScreen() {
        goActivity(MainActivity::class.java, isWillFinish = true)
    }

    private fun timer(duration: Long, onFinish: () -> Unit) {
        object : CountDownTimer(duration, duration) {
            override fun onTick(millisUntilFinished: Long) {}

            override fun onFinish() {
                onFinish.invoke()
            }
        }.start()
    }

    private fun <T> Activity.goActivity(targetClass: Class<T>, isWillFinish: Boolean = false) {
        startActivity(Intent(this, targetClass))
        if (isWillFinish) {
            finish()
        }
    }
}