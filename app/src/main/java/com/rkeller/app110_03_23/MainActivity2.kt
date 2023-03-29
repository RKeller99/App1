package com.rkeller.app110_03_23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

//Implementamos la interfaz View.OnClickListener y el método OnClick
class MainActivity2 : AppCompatActivity(), View.OnClickListener {

    //No se pueden poner variables sin inicializar, por eso la promesa de inicialización
    private lateinit var btnSaludo: Button
    private lateinit var tvSaludo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //El alcance de la variable es únicamente dentro de OnCreate
        //val btnSaludo = findViewById<Button>(R.id.btnSaludo)
        //val tvSaludo = findViewById<TextView>(R.id.tvSaludo)

        //Aquí ya se está implementando
        btnSaludo = findViewById<Button>(R.id.btnSaludo)
        tvSaludo = findViewById<TextView>(R.id.tvSaludo)

        //Para que funcione debo de ejecutar un método OnClickListener y un objeto que tenga esa interfaz, en este caso, la misma activity
        btnSaludo.setOnClickListener(this)
        tvSaludo.setOnClickListener(this)


    }

    //Mayor orden, con el uso de OnClick y con el when la diferenciación de cuando se usa cada cosa.
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnSaludo -> {
                tvSaludo.text = "Hola mundo"
            }
            R.id.tvSaludo -> {
                tvSaludo.text = "Hola Rodolfo"
            }
        }
    }
}