package com.twity.androidmaster.sintaxis

fun main(){
   //array
    var weekdays = arrayOf("lunes","martes","miercoles","jueves","viernes","Sab","dom")

    println(weekdays[0])
    println(weekdays.size)

    weekdays[1] = "MartesLindo"
    println(weekdays[1])

    //bucle
    for (x in weekdays){
        println ("el valor es $x" )
    }
    for(y in weekdays.indices){
        println("el indice $y = " + weekdays[y] )

    }
    println("xxxxxxxxxxxxxxxxxxxxx")
    for((posicion,value) in weekdays.withIndex()){
        println("el indice $posicion =  $value" )
    }

}