package com.example.p2hacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUpFinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_finish)

        val btnFinish: Button = findViewById(R.id.btnSignUpFinish)
        btnFinish.setOnClickListener {
            val intent = Intent(this, SignUpFinishActivity::class.java)
            startActivity(intent)
        }
    }
}