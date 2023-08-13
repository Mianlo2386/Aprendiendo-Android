package com.curso.android.app.cursodeandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.curso.android.app.cursodeandroid.imccalculator.ImcCalculatorActivity
import com.curso.android.app.cursodeandroid.PrimerProyecto.PrimerAppActivity


class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludoApp = findViewById<Button>(R.id.btnSaludoApp)
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)
        btnSaludoApp.setOnClickListener{ navigateToSaludoApp() }
        btnIMCApp.setOnClickListener{ navigateToImcApp() }
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

