package com.example.p2hacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectDevinationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_devination)

        val btnSignUpOmikuji: Button = findViewById(R.id.btnSignUpOmikuji)
//        val btnSignUpTarot: Button = findViewById(R.id.btnSignUpTarot)
//        val btnSignUpOracle: Button = findViewById(R.id.btnSignUpOracle)

        btnSignUpOmikuji.setOnClickListener{
            val intent = Intent(this, SignUpOmikujiActivity1::class.java)
            startActivity(intent)
        }
    }
}