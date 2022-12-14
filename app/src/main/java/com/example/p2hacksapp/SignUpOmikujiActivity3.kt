package com.example.p2hacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class SignUpOmikujiActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_omikuji3)

        val next : Button = findViewById(R.id.next3)
        val btnUsualFortune : ImageButton = findViewById(R.id.btnUsualFortune)

        next.setOnClickListener {
            val intent = Intent(this, SignUpFinishActivity::class.java)
            startActivity(intent)
        }

        btnUsualFortune.setOnClickListener{
            val intent = Intent(this, SignUpOmikujiActivity3::class.java)
            startActivity(intent)
        }
    }
}