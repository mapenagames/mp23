package com.twity.androidmaster.sintaxis

fun main() {
    /*
    Funciones extendidas  ********************************

    son funciones que permite añadir metodos a objetos que existan sin tener que
    heredar ni una clase o interfase
    */

    //ejemplo Extiendo la funsion "noespacios" al objeto String.

    // la siguiente funcion esta definida mas abajo.

    var usuario = "hola    soy usuario   con espacios"
    println("usuario           : $usuario  largo:${usuario.length}")
    //                                      V-- la funcion noespacios.
    println("usuario.noespaces : ${usuario.noespacios()}  largo:${usuario.noespacios().length}")

    //otro ejemplo, extiendo la funcion show al objeto IntArray

    var array2 = IntArray(3)
    array2[0] = 10
    array2[1] = 20
    array2[2] = 30
//                          V-- la funcion show
    println("array2 : ${array2.show()}")

}
// objteso IntArray se le extiende la funcion "show"
fun IntArray.show() {
    print("--[")
    for (i in this) print("$i ")
    println("]--");
}

// objteso String se le extiende la funcion "noespacios"
fun String.noespacios(): String {
    return this.replace(" ", "")
}
