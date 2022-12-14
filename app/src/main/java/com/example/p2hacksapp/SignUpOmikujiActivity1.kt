package com.example.p2hacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class SignUpOmikujiActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_omikuji1)
        val next : Button = findViewById(R.id.next)
        val btnGoodFortune : ImageButton= findViewById(R.id.btnGoodFortune)

        next.setOnClickListener {
            val intent = Intent(this, SignUpOmikujiActivity2::class.java)
            startActivity(intent)
        }

        btnGoodFortune.setOnClickListener{
            val intent = Intent(this, SignUpOmikujiActivity1::class.java)
            startActivity(intent)
        }

    }
}