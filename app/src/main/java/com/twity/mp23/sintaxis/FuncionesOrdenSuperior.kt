package com.twity.mp23.sintaxis


/*
    eta funcionalidad es para pasar funciones como parametros de otras funciones.
 */



private fun calculadora(n1:Int, n2:Int, fn: (Int,Int)->Int ): Int{
    return fn(n1,n2)
}


fun main() {
    println("la suma  de 80 + 20 es: ${calculadora(80,20,::suma)}")
    println("la resta de 100 y  20 es: ${calculadora(100,20,::resta)}")
}
private fun suma(x:Int, y:Int) = x+y
private fun resta(x:Int, y:Int) : Int { return x-y}
