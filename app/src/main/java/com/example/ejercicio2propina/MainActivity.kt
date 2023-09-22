package com.example.ejercicio2propina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //Atributos de la clase

    private lateinit var montoTo : EditText
    private lateinit var clientesTo : EditText
    private lateinit var btnPropina : Button
    private lateinit var tvResultado : TextView
    private lateinit var tvDivision : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inicializamos los atributos y los relacionamos con su elemento de la UI
        montoTo = findViewById(R.id.montoTo)
        clientesTo = findViewById(R.id.clientesTo)
        btnPropina = findViewById(R.id.btnPropina)
        tvResultado = findViewById(R.id.tvResultado)
        tvDivision = findViewById(R.id.tvDivision)

        btnPropina.setOnClickListener {
            //Validamos que las cajas de texto no esten vacias
            if (montoTo.text.isEmpty() || clientesTo.text.isEmpty()) {
                tvResultado.text = "Debes escribir un numero entero"
            } else {

                //Declaramos variables locales para obtener los valores de las cajas de texto
                var monto: Int = montoTo.text.toString().toInt()
                var clientes: Int = clientesTo.text.toString().toInt()

                //Hacemos la operacion
                var resultado: Double = ( monto * 0.10)
                var division: Double = resultado/clientes


                // Mostramos el resultado en el TextView
                tvResultado.text = "La propina a pagar es: $resultado"
                tvDivision.text = "Cada cliente debera pagar: $division"
            }
        }
    }
}

