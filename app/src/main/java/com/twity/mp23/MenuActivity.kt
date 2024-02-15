package com.twity.mp23
//video 7:14
//*********
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.twity.mp23.firstapp.FirstAppActivity
import com.twity.mp23.imccalculator.IamcCalculatorActivity
import com.twity.mp23.todoapp.TodoActivity


class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnImcApp = findViewById<Button>(R.id.btnIMCApp)
        val btnTodo = findViewById<Button>(R.id.btnTodo)

        btnSaludApp.setOnClickListener { navigateToSaludApp() }
        btnImcApp.setOnClickListener { navigateToImcApp() }
        btnTodo.setOnClickListener { navigateToTodo() }

    }

    private fun navigateToSaludApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp(){
        val intent = Intent(this, IamcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTodo() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }
}