package com.example.tarea1u1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configuracion de los clics para cada botón
        findViewById<Button>(R.id.btn1).setOnClickListener {
            startActivity(Intent(this, EntradasActivity2::class.java))
        }

        findViewById<Button>(R.id.btn2).setOnClickListener {
            startActivity(Intent(this, BotonesActivity::class.java))
        }

        findViewById<Button>(R.id.btn3).setOnClickListener {
            startActivity(Intent(this, SeleccionActivity::class.java))
        }

        findViewById<Button>(R.id.btn4).setOnClickListener {
            startActivity(Intent(this, ListasActivity::class.java))
        }

        findViewById<Button>(R.id.btn5).setOnClickListener {
            startActivity(Intent(this, InformacionActivity::class.java))
        }
    }
}