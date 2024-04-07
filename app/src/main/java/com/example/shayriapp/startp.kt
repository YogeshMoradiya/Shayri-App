package com.example.shayriapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class startp  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.startpage)

        val start: Button = findViewById(R.id.start)
        start.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
        val share:Button=findViewById(R.id.share_btn)
        share.setOnClickListener {
            shareContent()
        }
    }

    private fun shareContent() {
        val shareIntent = Intent().apply {
            action = Intent.ACTION_SEND
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, "share content")
        }
        startActivity(Intent.createChooser(shareIntent, "Share via"))
    }
}


