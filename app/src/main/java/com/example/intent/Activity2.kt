package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class Activity2 : AppCompatActivity() {

    private lateinit var tvnama : TextView
    private lateinit var etnama : EditText
    private lateinit var tvumur : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        var btn_activity2 = findViewById<Button>(R.id.btn_activity2)

        tvnama = findViewById(R.id.tv_nama)
        etnama = findViewById(R.id.et_nama)
        tvumur = findViewById(R.id.tv_age)

        val nama = intent.getStringExtra("NAMA")
        val umur = intent.getStringExtra("AGE")

        tvnama.setText(nama)
        tvumur.setText(umur)


        btn_activity2.setOnClickListener{
            val intent = Intent(this@Activity2, MainActivity::class.java)
            startActivity(intent)
        }
    }
}