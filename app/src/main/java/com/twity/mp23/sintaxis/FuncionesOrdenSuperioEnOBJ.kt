package com.twity.mp23.sintaxis

/*
    eta funcionalidad es para pasar funciones como parametros de otras funciones. en OBJETOS
 */

class Person(
    var name: String = "Anonimo",
    var passport: String? = null,
    var heght: Float = 1.63f
) {
    var alive = true
    fun die() {
        alive = false
    }

    // en la funcion siguiente se ve el Order Superior en el objeto
    // el checkPolice es una funcion del objeto Person , donde
    // en "fn: (Float) -> Boolean" defino que se invocara una funcion cuyo parametro entra es Float y salida Boolean
    // en ": Boolean {"  le digo que la funcion checkPolice retorna Boolean
    // en "return fn(heght)"  digo que la funcion checkPolice retorna el contenido de la funcion que se pasa por parametro
    // el "heght" es el valor del objeto Persona

    fun checkPolice(fn: (Float) -> Boolean): Boolean {
        return fn(heght)
    }


}
class Person2(
    var name: String = "Anonimo",
    var passport: String? = null,
    var heght: Float = 1.63f
) {
    var alive = true
    fun die() {
        alive = false
    }

    // mismo ejemplo de la clase Person pero vemos con podemos crear una FUncion de Extension en el objeto desde afuera de la clase   /*

    /*  la defino en el bloque main:
    fun checkPolice2(fn: (Float) -> Boolean): Boolean {
        return fn(heght)
    }
    */

}
private fun inColombia(h: Float): Boolean {return h > 1.6f}
private fun inSpain(h: Float): Boolean {return h > 1.65f}


// uso de la funcion de extension, es decir, extiendo la funcion checkPolice al objeto Person2
private fun Person2.checkPolice(fn: (Float) -> Boolean): Boolean {
    return fn(heght)
}
fun main() {
    println("funcion simple, ejemplo inColombia: " + inColombia(1.8f).toString())

    var pepe: Person = Person()
    var pepe2: Person2 = Person2()

    println(" pepe.height= ${pepe.heght}")
    println(" Policia de Colombia : ${pepe.checkPolice(::inColombia)}")
    println(" Policia de Colombia : ${pepe.checkPolice(::inSpain)}")
    println(" ")
    println(" pepe.height= ${pepe2.heght}")
    println(" Policia de Colombia : ${pepe2.checkPolice(::inColombia)}")
    println(" Policia de Colombia : ${pepe2.checkPolice(::inSpain)}")

}
