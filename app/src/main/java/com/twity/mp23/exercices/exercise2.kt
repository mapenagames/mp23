package com.twity.androidmaster.exercices

/**
 *las entradas de cine suelen tener un precio diferente segun la edad de los espectadores
 *
 * en el codigo inicial que se proporciona en el siguiente fragmento de codigo, escribe un programa
 * uqe calcule los precios de estas entradas basadas en
 *
 * a) un precio de entrada infantil de usd 15 para personas de 12 años o menos
 * b) un precio de entrada estandard de usd 30 para personas de entre 13 y 60 años   y los Lunes,
 *    un precio estandar con descuento de usd 25 para el mismo grupo etario
 *
 * c) un precio para adultos mayores de usd 20 para personas de 61 años o mas (asumimos 100 años de max)
 *
 * un precion de -1 para indicar que el precio no es valido cuando un usuario ingreso la edda fuera
 * de lo espefificado
 *
 *
 *
 */


fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("the ticket price x person aged $child is \$${ticketprice2(child, isMonday)}.")
    println("the ticket price x person aged $adult is \$${ticketprice(adult, isMonday)}.")
    println("the ticket price x person aged $senior is \$${ticketprice(senior, isMonday)}.")
}

fun ticketprice(age: Int, isMonday: Boolean): Int {
    var precio: Int
    when (age) {
        in 1..12 -> precio = 15
        in 13..60 -> {
            if (isMonday) {
                precio = 25
            } else {
                precio = 30
            }
        }

        in 61..100 -> precio = 20
        else -> precio = -1

    }
    return precio
}
//
fun ticketprice2(age: Int, isMonday: Boolean): Int {
    return when (age) {
        in 0..12 -> 15
        in 13..60 -> if (isMonday) 25 else 30
        in 61..100 -> 20
        else ->  -1
    }
}
