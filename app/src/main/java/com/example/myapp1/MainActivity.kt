package com.example.myapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var button2: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        button.setOnClickListener {
            Toast.makeText(this, "button click", Toast.LENGTH_SHORT).show()
        }

        button2 = findViewById(R.id.button2)
        button2.setOnClickListener {
            Toast.makeText(this, "button2 click", Toast.LENGTH_SHORT).show()
        }
    }
}