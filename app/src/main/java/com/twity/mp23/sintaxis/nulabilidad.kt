package com.twity.androidmaster.sintaxis

fun main() {
    var xx: String = "Marcelo"
    println(xx[1])
    //esto es lo mismo que el xx[1]
    println(xx.get(1))
    //al definir String?  el "?" significa que la variable puede ser nula
    var name: String? = "marcelo"

    // los dos "!!" significa que le indico al programa que si o si la
    // posicion 1 del string no es nula
    println("!!!!!!!!!!!!!!!")
    println(name!![1]) // esto es lo mismo que la linea siguiente
    println(name!!.get(1))

    // el "?" significa que valida que si no es nulo devuelve el valor
    // caso contrario devuelve null pero no rompe
    name = null
    println("????????????????")
    println(name?.get(1)) // esta linea no revienta porque esta el ?
    println(name?.get(1) ?: "es un valor nulo")
    //          ^        ^
    //          |        |
    //          -> ? dice que si no es nulo dame el elemento 1 de la variable
    //                   -> por else de la condicion retornar el "es un valor nulo"

}