package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonGraficos = findViewById<Button>(R.id.buttonGraficos) as Button
        val buttonOperaciones = findViewById<Button>(R.id.buttonOperaciones) as Button
        val buttonSalir = findViewById<Button>(R.id.buttonSalir) as Button
        val buttonAcercade = findViewById<Button>(R.id.buttonAcerca) as Button



        buttonGraficos.setOnClickListener(){
            val intent = Intent(this@MainActivity,GraficoActivity::class.java)
            startActivity(intent)
        }
        buttonOperaciones.setOnClickListener(){
            val intent = Intent(this@MainActivity,OperacionesActivity::class.java)
            startActivity(intent)
        }

        buttonAcercade.setOnClickListener(){
            val intent = Intent(this@MainActivity,Acercade_Activity::class.java)
            startActivity(intent)
        }

        buttonSalir.setOnClickListener(){
            finish()
        }

    }
}