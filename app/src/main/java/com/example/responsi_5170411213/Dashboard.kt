package com.example.responsi_5170411213

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        var i = intent
        val nama = i.getStringExtra("nama")
        val nim = i.getStringExtra("nim")

        val tampil = findViewById<TextView>(R.id.textView)

        tampil.text="Nama :"+nama+"nim : "+nim
    }
}
