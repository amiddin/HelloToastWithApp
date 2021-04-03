package com.example.l3_mop_201853004_201853014_201853036_a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.btnCek)
        button.setOnClickListener {
            this.startActivity(Intent(this, HalPemesanan::class.java)) }
    }
}