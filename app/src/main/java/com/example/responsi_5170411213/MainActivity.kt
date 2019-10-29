package com.example.responsi_5170411213

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_login.setOnClickListener{
            val user = ed_user.text.toString()
            val pass = ed_pass.text.toString()

            if(user.isEmpty()|| pass.isEmpty()){
                Toast.makeText(this, "please Insert Email dan Pass", Toast.LENGTH_SHORT).show()
            }

            if(user == "admin" || pass == "123"){
                val intent = Intent (this, Dashboard::class.java)
                startActivity(intent)
                finish()
            }

        btn_reg.setOnClickListener{
            val intent = Intent(this@MainActivity, form_data_register::class.java)
            startActivity(intent)
        }

        }
    }
}
