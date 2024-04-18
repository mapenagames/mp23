package com.twity.mp23.sintaxis

typealias aliasdatos = MutableMap<Int,ArrayList<String>>


fun main() {
    println(" ")
    println("typealias")
    println("*********")
    /*  aliasdatos   es un allias
    esta definido al comienzo de este archivo
     */
    var saludos:aliasdatos = mutableMapOf()
    saludos[0]= arrayListOf("hola","Adios")
    saludos[1]= arrayListOf("hi","bye")

    println("saludo[0]: ${saludos[0]}")
    println(saludos.get(1) )

}