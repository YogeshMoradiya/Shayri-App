package com.example.shayriapp


import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class Class2(var mainActivity2: MainActivity2, var blank: Array<String>) : BaseAdapter() {
    override fun getCount(): Int {
        return blank.size
    }

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {

        var copy: ImageView
        var share : ImageView
        var whatsapp: ImageView

        var listv: TextView

        var view2 = LayoutInflater.from(mainActivity2).inflate(R.layout.card2, p2, false)

        var card2: TextView
        card2 = view2.findViewById(R.id.listv)
        copy = view2.findViewById(R.id.copy)
        whatsapp=view2.findViewById(R.id.whatsapp)
        share=view2.findViewById(R.id.share)
        listv=view2.findViewById(R.id.listv)


        copy.setOnClickListener {

            var shayri = blank[position]

            val clipboardManager =
                mainActivity2.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clipData = ClipData.newPlainText("text", shayri)
            clipboardManager.setPrimaryClip(clipData)
            Toast.makeText(mainActivity2, "copy", Toast.LENGTH_SHORT).show()

        }

        share.setOnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, blank[position])
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            mainActivity2.startActivity(shareIntent)
        }

        whatsapp.setOnClickListener {
            val message = blank[position]
            sendMessage(message)
        }

        card2.setText(blank[position])

        return view2
    }//change//
    private fun sendMessage(message: String) {

        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, message)
            type = "text/plain"
            setPackage("com.whatsapp")
        }

        val whatsappIntent = Intent.createChooser(sendIntent, null)
        mainActivity2.startActivity(whatsappIntent)
    }
}

