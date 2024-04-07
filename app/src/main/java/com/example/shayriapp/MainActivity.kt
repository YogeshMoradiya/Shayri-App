package com.example.shayriapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView


class MainActivity : AppCompatActivity() {

    var array = arrayOf(
        "Morning Shayri",
        "Attitude Shayri",
        "Funny Shayri",
        "Sad Shayri",
        "Best Wishes",
        "God Shayri",
        "Night Shayri",
        "Brithday Shayri",
        "All In One",
        "Kite Shayri",
        "Diwali Shayri",
        "2 Line Shayri",
        "Motivational Shayri",
        "Other Shayri",
        "Royal Shayri",
        "Janmashtami Shayri",
        "Indepandence Shayri",
        "Holi Shayri",
        "Valentine Shayri",
        "Republic Shayri",
        "Ganesha Shayri",
        "Navratri Shayri"
    )
    lateinit var main: ListView
    lateinit var home: Button

    var color = arrayOf(
        R.drawable.colour,
        R.drawable.colour1,
        R.drawable.colour2,
        R.drawable.colour3,
        R.drawable.colour4,
        R.drawable.colour5,
        R.drawable.colour6,
        R.drawable.colour7,
        R.drawable.colour8,
        R.drawable.colour9,
        R.drawable.colour10,
        R.drawable.colour11,
        R.drawable.colour12,
        R.drawable.colour13,
        R.drawable.colour14,
        R.drawable.colour15,
        R.drawable.colour16,
        R.drawable.colour17,
        R.drawable.colour18,
        R.drawable.colour19,
        R.drawable.colour20,
        R.drawable.colour21,
        R.drawable.colour22,
        R.drawable.colour23,
        R.drawable.colour24
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        home = findViewById(R.id.home)
        main = findViewById(R.id.main)

        home.setOnClickListener {
            val intent = Intent(this@MainActivity, startp::class.java)
            finish()
        }
        //var adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,array)

        var adapter = Class1(this, array, color)

        main.adapter = adapter

        main.setOnItemClickListener { parent, view, position, id ->

            var intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent.putExtra("m1", array[position]))
        }



    }
}
