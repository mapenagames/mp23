package com.twity.mp23.sintaxis.pooUdemy

open class deportista(
    var nombre: String,
    var estatura: Int = 0,
    var peso: Float = 0f,
    var edad: Int = 0
) {
    fun descansar() {
        println("Deportista esta descansando")
    }

    open fun competir() {
        println("deportista va a competir")
    }
}

open class runner(
    nombre: String,
    estatura: Int,
    peso: Float,
    edad: Int,
    var estilo: String = "",
    var velocidad: Int = 0
) : deportista(nombre, estatura, peso, edad) {

    fun correr() {
        println("el corredor esta corriendo,estilo:${this.estilo} a una velocidad :${this.velocidad}")
    }

    override fun competir() {
        println("voy a correr")
    }
}

open class ciclista(
    nombre: String,
    estatura: Int,
    peso: Float,
    edad: Int,
    var tipoBici: String = "", var velocidad: Int
) : deportista(nombre, estatura, peso, edad) {

    fun pedalear() {
        println("el ciclista esta pedaleando con :${this.tipoBici} a una velocidad ${this.velocidad}")
    }

    override fun competir() {
        println("voy a pedalear")
    }
}

open class nadador(
    nombre: String,
    estatura: Int,
    peso: Float,
    edad: Int,
    var estilo: String = "", var velocidad: Int
) : deportista(nombre, estatura, peso, edad) {
    override fun competir() {
        println("voy a nadar")
    }
}

class triatleta(
    nombre: String,
    estatura: Int,
    peso: Float,
    edad: Int,
    estiloCorrer: String,
    velocidadCorrer: Int,
    tipoBici: String, velocidadBici: Int,
    estiloNadar: String, velocidadNadar: Int) :
    ciclista(nombre, estatura, peso, edad, tipoBici, velocidadBici),
    runner(nombre, estatura, peso, edad, estiloCorrer, velocidadCorrer),

    nadador(nombre, estatura, peso, edad, estiloNadar, velocidadNadar) {
    fun competir() {
        super<runner>.competir()
        super<ciclista>.competir()
        super<nadador>.competir()
    }

}


fun main() {

}