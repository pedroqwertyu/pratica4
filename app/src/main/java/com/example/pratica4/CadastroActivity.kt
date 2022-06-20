package com.example.pratica4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CadastroActivity : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_cadastro)
        setSupportActionBar(findViewById(R.id.tbrCadastro))
        setTitle("Novo Pedido de Tosa")

        val botao = findViewById<Button>(R.id.btnSalvarCadastro)
        botao.setOnClickListener {
            finish()
        }
    }
}