package com.rkeller.app110_03_23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Vinculación de vista
        val btnSaludo = findViewById<Button>(R.id.btnSaludo)
        val tvSaludo = findViewById<TextView>(R.id.tvSaludo)

        //Opción 1
        btnSaludo.setOnClickListener {
            Log.d("LOGTAG","Hola mundo")
            tvSaludo.text = "Hola mundo"
        }

        tvSaludo.setOnClickListener {
            Log.d("LOGTAG","Hola mundo")
            tvSaludo.text = "Hola Rodolfo"
        }

        //Opción 2
        //val lambda: (View) -> Unit = { Log.d("LOGTAG","Hola mundo") }
        //btnSaludo.setOnClickListener(lambda)

        //Opción 3
        //btnSaludo.setOnClickListener({ Log.d("LOGTAG","Hola mundo") })



    }
}