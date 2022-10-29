package com.joel.healthathome

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGs = findViewById<Button>(R.id.btn_gs)


        btnGs.setOnClickListener{
            var intent = Intent(applicationContext , SingInActivity::class.java)
            startActivity(intent)
        }

    }
}