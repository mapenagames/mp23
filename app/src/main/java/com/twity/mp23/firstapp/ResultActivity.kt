package com.twity.mp23.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.twity.mp23.R
import android.util.Log
import android.widget.TextView


class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val name:String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        Log.i("marce", "vtResult: $name")
        tvResult.text = "Hola $name"

    }
}