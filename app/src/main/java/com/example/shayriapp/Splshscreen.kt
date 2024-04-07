package com.example.shayriapp

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView

class Splshscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splshscreen)


        val imageView = findViewById<ImageView>(R.id.si)
        imageView.setBackgroundResource(R.drawable.splash_animation)

        val animationDrawable = imageView.background as AnimationDrawable
        animationDrawable.start()

        Handler().postDelayed({
            startActivity(Intent(this@Splshscreen,startp::class.java))
            finish()
        },1500)

    }
}