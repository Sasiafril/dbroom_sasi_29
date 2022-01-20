package com.example.dbroom_sasi_29

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    private val splasScreentimeout : Long= 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)


        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()

        }, splasScreentimeout)


    }
}