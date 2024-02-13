package com.twity.androidmaster.sintaxis

fun main() {
    ifMultiple()
    //ifBasico()
    //ifAnidado()
    //ifBasico()
}

fun ifMultiple() {
    var edad = 18
    var soyFeliz: Boolean = true
// and
    if (edad >= 18 && soyFeliz) {
        println("joya")
    }
// or
    soyFeliz = false
    if (edad >= 18 || soyFeliz) {
        println("joya2")
    }

}

fun ifBoolean() {
    var soyFeliz: Boolean = true

    if (soyFeliz) {
        println("soy Feliz")
    }
    //! es negacion
    if (!soyFeliz) {
        println("soy Feliz")
    }
}

fun ifAnidado() {
    var animal = "dogs"
    if (animal == "dog") {
        println("es un perro")
    } else if (animal == "cat") {
        println("es un perro")
    } else if (animal == "bird") {
        println(" es un bird")
    } else {
        println("no es nada")
    }
}

fun ifBasico() {
    val name = "Aris"

    if (name.lowercase() == "pepe") {
        println("la variable name tiene Aris")
    } else {
        println("salgo por el else")
    }
}
