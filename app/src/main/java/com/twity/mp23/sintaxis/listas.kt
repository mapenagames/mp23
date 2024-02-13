package com.twity.androidmaster.sintaxis

fun main() {
    mutable()
    //inmutablelist()


}

fun mutable() {
    println("lista mutable")
    var weekdays: MutableList<String> =
        mutableListOf("lunes", "martes", "miercoles", "jueves", "viernes", "Sab", "dom")
// por default el add agrega elemento al final
// weekdays.add("ArisDay")  => de esta manera agrega el elemento al final de la lista

//si se especifica un indice en el add entonces significa que el elemento lo inserta en ese indice
//y desplaza el array una posicion a partir de ese indice.


    weekdays.add(2,"ArisDay")
    println(weekdays)

    //para saber si la lista tiene elementos, se pude usar isEmpty()
    if (weekdays.isEmpty()) {
        println("lista vacia")
    }else{
        println("lista completa")
    }


    if (weekdays.isNotEmpty()) {
        println("lista completa")
    }else{
        println("lista vacia")
    }
}

fun inmutablelist() {
    println("lista inmutable")
    val readOnly: List<String> =
        listOf("lunes", "martes", "miercoles", "jueves", "viernes", "Sab", "dom")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    //FILTRAR
    // en la linea siguiente, el parametro "it" va a tomar por cada iteracion el valor de la lista,
    // por ejemplo la primera vez it va a valer "lunes", la segunda "martes", etc.

    val example = readOnly.filter { it.contains("a") }
    // genere una array tomando de base readonly con un filtro
    println(example)

    println("otra forma de iterar")
    //en la instruccion foreach defino la var elemento para que guarde el valor x cada iteracion
    readOnly.forEach { elemento -> println(elemento) }
    println("-----------------------")
    //otra forma de iterar
    readOnly.forEach { println(it) }


}