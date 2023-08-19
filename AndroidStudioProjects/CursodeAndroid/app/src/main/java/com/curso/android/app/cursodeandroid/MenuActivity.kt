package com.curso.android.app.cursodeandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.curso.android.app.cursodeandroid.imccalculator.ImcCalculatorActivity
import com.curso.android.app.cursodeandroid.PrimerProyecto.PrimerAppActivity
import com.curso.android.app.cursodeandroid.R.id.btnTODO
import com.curso.android.app.cursodeandroid.todoapp.TodoActivity


class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludoApp = findViewById<Button>(R.id.btnSaludoApp)
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)
        val btnTODO = findViewById<Button>(R.id.btnTODO)
        btnSaludoApp.setOnClickListener{ navigateToSaludoApp() }
        btnIMCApp.setOnClickListener{ navigateToImcApp() }
        btnTODO.setOnClickListener{ navigateToTodoApp() }
    }
    private fun navigateToTodoApp(){
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludoApp(){
        val intent = Intent(this, PrimerAppActivity::class.java)
        startActivity(intent)
    }
}

