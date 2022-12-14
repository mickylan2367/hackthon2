package com.example.p2hacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class SignUpOmikujiActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_omikuji2)

        val next : Button = findViewById(R.id.next2)
        val btnBadFortune : ImageButton = findViewById(R.id.btnBadFortune)

        next.setOnClickListener {
            val intent = Intent(this, SignUpOmikujiActivity3::class.java)
            startActivity(intent)
        }

        btnBadFortune.setOnClickListener{
            val intent = Intent(this, SignUpOmikujiActivity1::class.java)
            startActivity(intent)
        }
    }
}