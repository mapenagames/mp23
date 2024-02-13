package com.twity.mp23.imccalculator
/*
video 6:08:45

 */
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import com.twity.androidmaster.sintaxis.result
import com.twity.mp23.R
import com.twity.mp23.firstapp.FirstAppActivity
import java.text.DecimalFormat

class IamcCalculatorActivity : AppCompatActivity() {

    private var isMasculinoSelected: Boolean = true
    private var isfemeninoSelected: Boolean = false
    private var currentPeso: Int = 70
    private var currentEdad: Int = 26
    private var currentAltura: Int = 120


    /* las vistar viewMasculino y viewFemenio se define como privada por que solo se usan
     en esta clase
     y se le indica lateinit para que se initialze mas abajo del OnCreate
     * */
    private lateinit var viewMasculino: CardView
    private lateinit var viewFemenino: CardView

    private lateinit var tvAltura: TextView
    private lateinit var rsAltura: RangeSlider

    private lateinit var btnRestarPeso: FloatingActionButton
    private lateinit var btnSumarPeso: FloatingActionButton
    private lateinit var tvPeso: TextView

    private lateinit var btnRestarEdad: FloatingActionButton
    private lateinit var btnSumarEdad: FloatingActionButton
    private lateinit var tvEdad: TextView

    private lateinit var btnCalcular: Button

    /* Todo lo que se defina en companion object es leido por todos lados */
    companion object {
        const val IMC_KEY = "IMC_RESULT" // es la clave de lo que se manda en el extra. Nagigate To Result.

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iamc_calculator)
        initComponente() // se defini/serea las variabes para invocar los viewcard
        initListenears() // Se define los objectos cuando se hace un click
        initUI()

    }


    // seteo las variables a los objetos cardvie, textvie, rangeslider,etc
    private fun initComponente() { // aca inicializa las vistas
        viewFemenino = findViewById(R.id.viewFemenino)
        viewMasculino = findViewById(R.id.viewMasculino)

        tvAltura = findViewById(R.id.tvAltura)
        rsAltura = findViewById(R.id.rsAltura)

        btnRestarPeso = findViewById(R.id.btnRestarPeso)
        btnSumarPeso = findViewById(R.id.btnSumarPeso)
        tvPeso = findViewById(R.id.tvPeso)

        btnRestarEdad = findViewById(R.id.btnRestarEdad)
        btnSumarEdad = findViewById(R.id.btnSumarEdad)
        tvEdad = findViewById(R.id.tvedad)

        btnCalcular = findViewById(R.id.btnCalcular)
    }

    private fun initListenears() {
        viewMasculino.setOnClickListener {
            changeGender()
            setGenderColor()
        }
        viewFemenino.setOnClickListener {
            changeGender()
            setGenderColor()
        }

        rsAltura.addOnChangeListener { _, value, _ ->

            val df = DecimalFormat("#.##")
            val currentAltura = df.format(value).toInt()
            tvAltura.text = "$currentAltura cm"
        }
        btnSumarPeso.setOnClickListener {
            currentPeso += 1
            setearPeso()
        }
        btnRestarPeso.setOnClickListener {
            currentPeso -= 1
            setearPeso()
        }
        btnSumarEdad.setOnClickListener {
            currentEdad += 1
            setearEdad()
        }
        btnRestarEdad.setOnClickListener {
            currentEdad -= 1
            setearEdad()
        }

        btnCalcular.setOnClickListener {
            val result = calcularIMC()
            navegateToResult(result)
        }
    }

    private fun navegateToResult(resultado: Double) {
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra(IMC_KEY, resultado)
        startActivity(intent)

    }

    private fun calcularIMC(): Double {
        val df = DecimalFormat("#.##")
        val imc = currentPeso / (currentAltura.toDouble() / 100 * currentAltura.toDouble() / 100)
        val result = df.format(imc).toDouble()
        Log.i("imc", "el imc es:$result")
        return result
    }

    private fun setearPeso() {
        tvPeso.text = currentPeso.toString()
    }

    private fun setearEdad() {
        tvEdad.text = currentEdad.toString()
    }

    private fun changeGender() {
        isMasculinoSelected = !isMasculinoSelected
        isfemeninoSelected = !isfemeninoSelected
    }

    private fun setGenderColor() {

        viewMasculino.setCardBackgroundColor(getBackgroundColor(isMasculinoSelected))
        viewFemenino.setCardBackgroundColor(getBackgroundColor(isfemeninoSelected))
    }

    private fun getBackgroundColor(isSelectedComponent: Boolean): Int {

        val colorReference = if (isSelectedComponent) {
            R.color.background_component_selected
        } else {
            R.color.background_component
        }
        return ContextCompat.getColor(this, colorReference)
    }

    private fun initUI() {
        setGenderColor()
        setearPeso()
        setearEdad()

    }
}