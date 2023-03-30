package com.example.intenciones07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Tecladito : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tecladito)

        val btn1: Button= findViewById(R.id.btn1)
        val btn2: Button= findViewById(R.id.btn2)
        val btn3: Button= findViewById(R.id.btn3)
        val btn4: Button= findViewById(R.id.btn4)
        val btnEliminar: Button= findViewById(R.id.btnEliminar)
        val btnLimpiar: Button = findViewById(R.id.btnLimpiar)
        numeros = findViewById(R.id.txtNumeros)

        btn1.setOnClickListener{
            numeros.text = numeros.text.toString() + "1"
        }
        btn2.setOnClickListener {
            numeros.text = numeros.text.toString() + "2"
        }
        btn3.setOnClickListener {
            numeros.text = numeros.text.toString() + "3"
        }
        btn4.setOnClickListener {
            numeros.text = numeros.text.toString() + "4"
        }
        btnEliminar.setOnClickListener {
            val filaActual = numeros .text.String()
            if (filaActual.isNotEmpty()){
                numeros.text = filaActual.substring(0, filaActual.length -1)
            }
        }
        btnLimpiar.setOnClickListener {
            numeros.text = ""
        }
    }
}