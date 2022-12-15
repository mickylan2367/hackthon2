package com.example.p2hacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class PopUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pop_up)

        val btn_diary = findViewById<Button>(R.id.btn_diary)
        val btn_fortune = findViewById<Button>(R.id.btn_fortune)
        val btn_back = findViewById<Button>(R.id.btn_back)

        btn_diary.setOnClickListener{
            val intent = Intent(this, ShowDiaryActivity::class.java)
            startActivity(intent)
        }

        btn_fortune.setOnClickListener{
            val intent = Intent(this, ShowFortuneLogActivity::class.java)
            startActivity(intent)
        }

        btn_back.setOnClickListener{
            val intent = Intent(this, CalenderActivity::class.java)
            startActivity(intent)
        }

        btn_back.setOnLongClickListener{ view->
            Toast.makeText(this, "Long Click detected", Toast.LENGTH_LONG).show()
            return@setOnLongClickListener true
        }
    }
}