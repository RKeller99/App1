package com.rkeller.app110_03_23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {

    //No se pueden poner variables sin inicializar, por eso la promesa de inicialización
    private lateinit var btnSaludo: Button
    private lateinit var tvSaludo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        btnSaludo = findViewById<Button>(R.id.btnSaludo)
        tvSaludo = findViewById<TextView>(R.id.tvSaludo)
    }

    fun miClick(view: View) {
        when(view.id){
            R.id.btnSaludo -> {
                tvSaludo.text = "Hola mundo"
            }
            R.id.tvSaludo -> {
                tvSaludo.text = "Hola Rodolfo"
            }
        }
    }
}