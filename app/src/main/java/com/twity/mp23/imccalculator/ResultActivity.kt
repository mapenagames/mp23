package com.twity.mp23.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.twity.mp23.R
import com.twity.mp23.imccalculator.IamcCalculatorActivity.Companion.IMC_KEY

class ResultActivity : AppCompatActivity() {

    private lateinit var tvResult :TextView
    private lateinit var tvImc :TextView
    private lateinit var tvDescripcion :TextView
    private lateinit var btnRecalcular :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result2)
        // el signo de interrogacion es para indicar que si tiene la variable a recibir que la asigne
        // asi de esta forma no cancela.
        //
        // Operador elvis ===>    first operand ?: second operand
        // SI tienes algun extra damelo ---. Si no la tienes dame -.
        //                                 V                       V
        val  result = intent.extras?.getDouble(IMC_KEY) ?: -1.0
        // recordemes que IMC_KEY es una constante que se creo en IamcCalculatorActivity
        // IMC_KEY

        initComponentes()
        initUI(result)
        initLiseners()
    }

    private fun initLiseners() {
        btnRecalcular.setOnClickListener { onBackPressed() }
    }

    private fun initUI(result: Double) {
        tvImc.text = result.toString()
        when(result){
            in 0.00..18.50 ->{
                tvResult.text = getString(R.string.title_bajo_peso)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.peso_bajo))
                tvDescripcion.text = getString(R.string.Descricption_bajo_peso)
            }
            in 18.51..24.99 ->{
                tvResult.text = getString(R.string.title_normal_peso)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.peso_normal))
                tvDescripcion.text = getString(R.string.Descricption_Normal_peso)
            }
            in 25.00..29.99 ->{
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.peso_alto))
                tvResult.text = getString(R.string.title_alto_peso)
                tvDescripcion.text = getString(R.string.Descricption_alto_peso)
            }
           in 30.00..99.99 ->{
               tvResult.setTextColor(ContextCompat.getColor(this,R.color.peso_sobrealto))
                tvResult.text = getString(R.string.title_Sobrealto_peso)
                tvDescripcion.text = getString(R.string.Descricption_Sobrealto_peso)
            }
            else -> { //error
                tvImc.text = getString(R.string.error)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.peso_sobrealto))
                tvResult.text = getString(R.string.error)
                tvDescripcion.text = getString(R.string.error)
            }



        }
    }

    private fun initComponentes() {
        tvImc = findViewById(R.id.tvImc)
        tvResult = findViewById(R.id.tvResult)
        tvDescripcion = findViewById(R.id.tvDescripcion)
        btnRecalcular = findViewById(R.id.btnReCalcular)


    }
}