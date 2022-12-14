package com.example.p2hacksapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUpActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btnSignUp2 : Button = findViewById(R.id.signup2)

        btnSignUp2.setOnClickListener{
            val intent = Intent(this, SelectDevinationActivity::class.java)
            startActivity(intent)
        }
    }
}