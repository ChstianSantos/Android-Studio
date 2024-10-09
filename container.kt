
package com.example.imccalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.form.R

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referências aos componentes da interface
        val editTextAltura = findViewById<EditText>(R.id.editTextAltura)
        val editTextPeso = findViewById<EditText>(R.id.editTextPeso)
        val buttonCalcular = findViewById<Button>(R.id.buttonCalcular)
        val textViewResultado = findViewById<TextView>(R.id.textViewResultado)

        // Ação do botão Calcular
        buttonCalcular.setOnClickListener {
            // Verifica se os campos não estão vazios
            val alturaStr = editTextAltura.text.toString()
            val pesoStr = editTextPeso.text.toString()

            if (alturaStr.isNotEmpty() && pesoStr.isNotEmpty()) {
                val altura = alturaStr.toDouble()
                val peso = pesoStr.toDouble()

                // Calcula o IMC
                val imc = peso / (altura * altura)

                // Exibe o resultado no TextView
                textViewResultado.text = String.format("Seu IMC é: %.2f", imc)
            } else {
                // Mostra um alerta se os campos estiverem vazios
                Toast.makeText(this, "Por favor, insira altura e peso!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
