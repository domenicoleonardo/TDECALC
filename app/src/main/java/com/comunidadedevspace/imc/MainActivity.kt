package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Spinner
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    // Recuperar os componentes EditText
        // Criar uma variável e associar o componente de UI <EditText>
        //Colocar açã no botão


        val edt_peso = findViewById<TextInputEditText>(R.id.edt_peso) // Recuperar os componentes, qual o tipo de view? Nesse caso é um TextInputEditText. Pra diferenciar um do outro, se usa um ID.
        val edt_altura = findViewById<TextInputEditText>(R.id.edt_altura)
        val edt_idade = findViewById<TextInputEditText>(R.id.edt_idade)
        val edt_bodyfat = findViewById<TextInputEditText>(R.id.edt_bodyfat)

        val btncCalcular = findViewById<Button>(R.id.btn_calcular)

        //Recuperar texto digitado no peso
        btncCalcular.setOnClickListener {  //Ação do botão, tudo que estiver dentro, é a ação do botão.
            val peso = edt_peso.text
            val altura = edt_altura.text
            val idade = edt_idade.text
            val bodyfat = edt_bodyfat.text


            println()

        }

        val activity = resources.getStringArray(R.array.Activities)
        val adapter = ArrayAdapter(this, R.layout.dropsdown_item, activity)
        val activityAutoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)

        activityAutoCompleteTextView.setAdapter(adapter)


    }
}