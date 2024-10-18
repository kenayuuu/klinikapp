package com.niken.klinikapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageLogin : AppCompatActivity() {
    private lateinit var button2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_login)

        button2 = findViewById(R.id.button2)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        button2.setOnClickListener(){
            //untuk pindah page : intent
            //intent 2 : intent implicit dan intent explicit
            //inten implicit : intent kita buat sendiri dan yang belaku didalam project
            //intent expilicit : kita memanggil pihak ketiga / third party / libray : gmaps, gps,
            val intentMenu2 = Intent(this@PageLogin, PageRegister::class.java)
            startActivity(intentMenu2)
        }
    }
}