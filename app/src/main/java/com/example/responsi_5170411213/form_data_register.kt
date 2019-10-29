package com.example.responsi_5170411213

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class form_data_register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_data_register)


        val nama = findViewById<EditText>(R.id.ed_nama)
        val nim = findViewById<EditText>(R.id.ed_nim)
        val user = findViewById<EditText>(R.id.ed_user)
        val pass = findViewById<EditText>(R.id.ed_pass)

        btn_reg.setOnClickListener{
            val nama = nama.text.toString()
            val nim = nim.text.toString()
            val user = user.text.toString()
            val pass = pass.text.toString()

            var intent = Intent(this@form_data_register, Dashboard::class.java)

            intent.putExtra("nama",nama)
            intent.putExtra("nama",nim)
            intent.putExtra("nama",user)
            intent.putExtra("nama",pass)

            startActivity(intent)

        }

    }
}
