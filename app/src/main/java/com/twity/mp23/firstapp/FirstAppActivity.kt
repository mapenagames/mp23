package com.twity.mp23.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.twity.mp23.R
import android.content.Intent
import android.provider.Telephony.Mms.Intents
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val edName = findViewById<AppCompatEditText>(R.id.edName)

        //cuadno se levanta la pantalla se ejecuta esta funcion
        btnStart.setOnClickListener {
            val name: String = edName.text.toString()
            if (name.isNotEmpty()) {
                val intent = Intent(this,ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME",name)
                startActivity(intent)
                //Log.i("marce", "Button Pulsado: $name")
            }
        }

    }
}

/*
class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val edName = findViewById<AppCompatEditText>(R.id.edName)
        //cuadno se levanta la pantalla se ejecuta esta funcion


        btnStart.setOnClickListener {
            val name: String = edName.text.toString()
            if (name.isNotEmpty()) {
                val intent = Intent(this,ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME",name)
                startActivity(intent)
                //Log.i("marce", "Button Pulsado: $name")
            }
        }
    }
}
 */