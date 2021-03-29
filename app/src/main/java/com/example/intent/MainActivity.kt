package com.example.intent


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var etnama: EditText
    private lateinit var tvnama: TextView
    private lateinit var tvumur: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn_activity1 = findViewById<Button>(R.id.btn_activity1)
        var btn_changename = findViewById<Button>(R.id.btn_changename)

        tvnama = findViewById(R.id.tv_nama)
        etnama = findViewById(R.id.et_nama)
        tvumur = findViewById(R.id.tv_age)


        btn_changename.setOnClickListener {
            tvnama.setText(etnama.text)
        }


        btn_activity1.setOnClickListener{
            val intent = Intent(this@MainActivity, Activity2::class.java)
            intent.putExtra("NAMA", tvnama.text)
            intent.putExtra("AGE", tvumur.text)
            startActivity(intent)
        }
    }
}