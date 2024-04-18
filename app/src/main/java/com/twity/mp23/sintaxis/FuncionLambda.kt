package com.twity.mp23.sintaxis

/*
 parametro1         : n1
 parametro2         : n2
 parametro3         : fn: (Int,Int)->Int   es la estructura de la funcion que vamos a pasar x parametros

*/
private fun calculadora(n1: Int, n2: Int, fn: (Int, Int) -> Int): Int {

    return fn(n1, n2)
}

private fun suma(x: Int, y: Int): Int {
    return x + y
}

private fun resta(x: Int, y: Int): Int {
    return x - y
}

private fun recorrerarray(a: IntArray, fn: (Int) -> Unit){
    var contador = 0
    for (i in a) {
        contador += 1
        println("elemnto del array $contador:  con valor: $i ")
        fn(i)
    }
}
fun main() {
    println("Funciones lambdas")
    // se pasa una funcion "suma" como parametro

    println("la suma de 70 y 20: ${calculadora(70, 20, ::suma)}")
    println("la resta de 70 y 20: ${calculadora(70, 20, ::resta)}")

    var funcion = { x: Int, y: Int -> x + y }
    // se pasa una variable "funcion" como si fuera una funcion
    println("la suma  de 80 + 20 es: ${calculadora(80, 20, funcion)}")

    funcion = { x: Int, y: Int -> x - y }
    // se pasa una variable "funcion" como si fuera una funcion
    println("la resta  de 80 + 20 es: ${calculadora(80, 20, funcion)}")
    println("la multi de 80 * 20 es: ${calculadora(80, 20, { x: Int, y: Int -> x * y })}")
    //la lamda es invocada fuera del parentesis
    //sirve para aclarar mejor la vista que hay una lamda
    println("la multi de 80 * 20 es: ${calculadora(80, 20) { x: Int, y: Int -> x * y }}")


    //lambda anonima,
    println("la potencia de 2 a 5 es: ${
        calculadora(2, 5,
            { x, y ->
                var valor = 1
                for (i in 1..y) {
                    valor *= x
                    println(valor)

                }
                valor
            }

        )
    }")

    println("array4")
    // lo que esta entre llaves actua como una funcion lambda
    // en este caso para cada elemento de array lo seteo en 5
    var array4 = IntArray(5, { 5 })
    for (i in 0..4) print(" " + array4.elementAt(i).toString())

    println("\n array5")
    // en este caso para cada elemento de array es el valor de la iteracion
    var array5 = IntArray(5) { it }
    for (x in 0..4) print(" " + array5.elementAt(x).toString())

    println("\n array6")
    // en este caso para cada elemento de array lo seteo en el valor de iteracion por 3
    // parametro entrada           V
    // flecha                      V  V
    //valor o dato                 V  V  V
    var array6 = IntArray(5) { i -> i*3 }
    for (x in 0..4) print(" " + array6.elementAt(x).toString())

    println("\n array7")
    // en este caso vemos como una lambda accede a una variable "suma" fuera de la funcion
    /*
       private fun recorrerarray(a: IntArray, fn: (Int) -> Unit){
          for (i in a)
             fn(i)
       }
    */
    var array7 = IntArray(10) { 1 }
    var suma = 0
    recorrerarray(array7) {suma += it}
    println("suma : $suma")

}

