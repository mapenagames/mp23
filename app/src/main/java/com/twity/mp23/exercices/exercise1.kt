package com.twity.androidmaster.exercices

/**
 * Por lo general el telefono te proporciona un resumen de notificaciones
 *
 * en el codigo Inicial que se proporciona en el siguiente fragmento de codigo,
 * escribe un programa que imprima el mensaje de resumen segun la cantidad de notificaciones
 * que recibis. El mensaje debe incluir lo siguiente:
 *
 * La cntidad exacta de notificaciones cuando haya menos de 100
 * +99 como cantidad de notificaciones cuando haya 100 o mas
 *  */

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSumary(morningNotification)
    printNotificationSumary(eveningNotification)
}

fun printNotificationSumary(numberOfMessages: Int) {
    var result : String
    if (numberOfMessages > 99) {
       result = "+99 como cantidad de notificaciones"
    }else{
     //   result = numberOfMessages.toString() + " cantidad de notificaciones"
     //   tambien se pede hacer asi:
        result = "$numberOfMessages cantidad de notificaciones"

    }
    println (result)
}

