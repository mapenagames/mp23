package com.twity.androidmaster.sintaxis

fun main() {
/* al definir una variable de string con el signo?  significa que puede tener el valor null */

    var nombre:String? = "Pedro"
    println("1el nombre: $nombre")
    println("1el largo es: ${nombre?.length}")
    nombre  = null
    println("2el nombre: $nombre")
    println("2el largo es: ${nombre?.length}") /* devuelve el texto null y no cancela*/

    /* se puede ver como se puede resumir el if siguiente a una sola linea */
    if (nombre!=null){
        println("3el largo es: ${nombre?.length}")
    }else{
        println("esta variable es nula")
    }
    println("operador elvis.......")
    /*                                  condicion  "?:"         */
    /*                                      |                   */
    /*                                      |                   */
    /*                     antes del   ---> ?: <---    despues  */
    /*                          por true    |  por false        */
    /*                          |           V  |                */
    /*                          V           V  V                */
    println("el largo es :${nombre?.length}"?:"la variable es nula" )
    /*-------------*/


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

