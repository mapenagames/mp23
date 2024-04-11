package com.twity.mp23.sintaxis

import java.time.LocalDateTime             //paso1,paso2
import java.time.format.DateTimeFormatter  //paso1,paso2,paso4,paso5,hora1,hora2
import java.time.LocalDate                 //paso3,paso4,paso5
import java.time.LocalTime                 //hora1,hora2


fun main() {
    println("fecha ---------")
    paso1() //Fecha y hora actual (formato completo): jueves, marzo 21, 2024
    paso2() //Resultado: Por ejemplo, "2401" para enero de 2024.
    paso3() //Resultado: Por ejemplo, "2024/01/26" para el 26 de enero de 2024.
    paso4() //Resultado: Por ejemplo, "26/01/2024" para el 26 de enero de 2024.
    paso5() //Resultado  D/M/YY
    println("hora ---------")
    hora1() //Resultado: Por ejemplo, "15:30:45" para las 3:30:45 PM.
    hora2() //Formato de 12 horas con AM/PM (hh:mm a)

}
fun paso1() {
    val fechaHoraActual = LocalDateTime.now()
    val formatoCompleto = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy")
    val fechaFormateada = fechaHoraActual.format(formatoCompleto)
    //Fecha y hora actual (formato completo): jueves, marzo 21, 2024
    println("Fecha1 y hora actual (formato completo): $fechaFormateada")

}
fun paso2() {
    val fechaHoraActual = LocalDateTime.now()
    val formatoCorto = DateTimeFormatter.ofPattern("yyMM")
    val fechaFormateada = fechaHoraActual.format(formatoCorto)
    //Resultado: Por ejemplo, "2401" para enero de 2024.
    println("Fecha2 y hora actual (formato corto): $fechaFormateada")
}
fun paso3() {

    val fechaHoy = LocalDate.now()
    val formatoYYYYMMDD = DateTimeFormatter.ofPattern("yyyy/MM/dd")
    val fechaFormateada = fechaHoy.format(formatoYYYYMMDD)
    //Resultado: Por ejemplo, "2024/01/26" para el 26 de enero de 2024.
    println("Fecha3 actual (formato YYYY/MM/DD): $fechaFormateada")

}
fun paso4() {
    val fechaHoy = LocalDate.now()
    val formatoDDMMYYYY = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    val fechaFormateada = fechaHoy.format(formatoDDMMYYYY)
    //Resultado: Por ejemplo, "26/01/2024" para el 26 de enero de 2024.
    println("Fecha4 actual (formato DD/MM/YYYY): $fechaFormateada")

}
fun paso5() {
    val fechaHoy = LocalDate.now()
    val formatoDMyy = DateTimeFormatter.ofPattern("D/M/yy")
    val fechaFormateada = fechaHoy.format(formatoDMyy)
    //Formato D/M/YY:
    println("Fecha5 actual (calendario juliano formato D/M/YY): $fechaFormateada")

}

fun hora1() {
    val horaActual = LocalTime.now()
    val formato24Horas = DateTimeFormatter.ofPattern("HH:mm:ss")
    val horaFormateada = horaActual.format(formato24Horas)
    //Resultado: Por ejemplo, "15:30:45" para las 3:30:45 PM.
    println("Hora1  actual (formato 24 horas): $horaFormateada")
}




fun hora2() {

    val horaActual = LocalTime.now()
    val formato12Horas = DateTimeFormatter.ofPattern("hh:mm a")
    val horaFormateada = horaActual.format(formato12Horas)
    //Formato de 12 horas con AM/PM (hh:mm a)
    println("Hora2 actual (formato 12 horas): $horaFormateada")

}





