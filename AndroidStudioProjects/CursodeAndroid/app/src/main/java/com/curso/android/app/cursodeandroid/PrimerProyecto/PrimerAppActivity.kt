package com.curso.android.app.cursodeandroid.PrimerProyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.curso.android.app.cursodeandroid.R

class PrimerAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primer_app)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etName = findViewById<AppCompatEditText>(R.id.etName)


        btnStart.setOnClickListener{
            val name = etName.text.toString()
            if(name.isNotEmpty()){
                val intent = Intent(this,ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME",name)
                startActivity(intent)
            }

        }

        //Al arrancar pantalla
    }
}