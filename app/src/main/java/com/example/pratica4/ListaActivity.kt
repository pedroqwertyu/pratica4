package com.example.pratica4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaActivity : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_lista)
        setSupportActionBar(findViewById(R.id.tbrLista))
        setTitle("Lista de Tosa e Banho")

        val botao = findViewById<FloatingActionButton>(R.id.fabAdicionar)
        botao.setOnClickListener {
            val intencao = Intent(applicationContext, CadastroActivity::class.java)
            startActivity(intencao)
        }

        val botao1 = findViewById<Button>(R.id.btnSair)
        botao1.setOnClickListener {
            val intencao1 = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intencao1)
        }
    }
}