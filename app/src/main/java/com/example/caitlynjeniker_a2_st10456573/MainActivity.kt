package com.example.caitlynjeniker_a2_st10456573

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            val intent = Intent(this, secondPage::class.java)
            startActivity(intent)
        }

    }
}