package com.example.shayriapp


import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager

class MainActivity3 : AppCompatActivity() {

    lateinit var done: ViewPager
    lateinit var ar3:Button

    lateinit var copy: ImageView
    lateinit var whatsapp: ImageView
    lateinit var share: ImageView
    //lateinit var taxt : TextView

    var set2 = arrayOf<String>("")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        done = findViewById(R.id.done)
        ar3= findViewById(R.id.ar3)

        copy = findViewById(R.id.copy)
        share = findViewById(R.id.share)
        whatsapp = findViewById(R.id.whatsapp)
       // taxt= findViewById(R.id.taxt)

//        var position=intent.getStringExtra("m1")
//        taxt.setText(position)

        var position = intent.getIntExtra("pos", 0)
        var set = intent.getStringExtra("m2")
        set2 = intent.getStringArrayExtra("blank")!!

        ar3.setOnClickListener { view: View? ->
            val intent = Intent(this@MainActivity3, MainActivity2::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            finish()
        }

        var mypager = Pageradapterrr(this, set2)
        done.adapter = mypager
        done.setCurrentItem(position)

        copy.setOnClickListener {

            val shayariToCopy = set2[position]
            val clipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clipData = ClipData.newPlainText("text", shayariToCopy)
            clipboardManager.setPrimaryClip(clipData)
            Toast.makeText(this, "Shayari copied to clipboard", Toast.LENGTH_LONG).show()
        }
//
        share.setOnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, set2[position])
                type = "text/plain"
            }
            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }



        whatsapp.setOnClickListener {
            val message = set2[position]
            sendMessageToWhatsApp(message)
        }
    }

    private fun sendMessageToWhatsApp(message: String) {
        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, message)
            type = "text/plain"
            setPackage("com.whatsapp")
        }

        val whatsappIntent = Intent.createChooser(sendIntent, null)
        startActivity(whatsappIntent)
    }

}
