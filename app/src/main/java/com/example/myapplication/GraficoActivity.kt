package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GraficoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grafico)

        val buttonAtras = findViewById<Button>(R.id.buttonAtras) as Button

        buttonAtras.setOnClickListener(){
            val intent = Intent(this@GraficoActivity,MainActivity::class.java)
            startActivity(intent)
        }
    }
}