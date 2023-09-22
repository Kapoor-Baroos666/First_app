package com.example.teacher_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class secondactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)

        val bkButton: Button = findViewById(R.id.bkButton)

        bkButton.setOnClickListener {
            val intent = Intent(this@secondactivity, MainActivity::class.java)
            startActivity(intent)
        }

    }
}