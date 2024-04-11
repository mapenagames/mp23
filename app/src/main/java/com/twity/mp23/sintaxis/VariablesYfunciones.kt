
package com.twity.androidmaster.sintaxis

//VARIABLES
/**
 * comentario
 * comentario
 */
//varaibles global
var varGlobal: Int = 30

fun main() {
    //val pepe:String = "aa"       actuan como constantes. el valor se pude definir en tiempo de ejecucion
    //const val pepe = 10 + 10     el valor se define en tiempo de compilacion, por tal motivo
    //                             ocupan menos memoria
    //var pepe:String = "aa"       actuan como variables y se pueden modificar

    //variables

    var fecha = "05/10/2024"
    var mes = fecha.substring(3,5)
    println("mes: $mes")

    println("var varGlobal:" + varGlobal.toString())
    println("var varGlobal: ${varGlobal.toString()}")
    //variablesNumericas()
    //variablesBoolean()
    //variablesString()
    showMyName("marcelo")
    showMyAge(30)
    add(10, 20)

    println("resto:" + subtract(10, 5).toString())
    println("restoCool:" + subtractCool(50, 5).toString())

    showVarByDefault(50)
    showVarByDefault()
//  funcion lamda


}

fun showVarByDefault(valordefault: Int = 30) {
    println("valor de default $valordefault")
    varGlobal = varGlobal + 1
    println("var varGlobal:" + varGlobal.toString())
}

fun showMyName(name: String) {
    println("Mi nombre es:$name")
}

fun showMyAge(currentAge: Int) {
    println("tengo $currentAge años")
}

fun add(valor1: Int, valor2: Int) {
    println(valor1 + valor2)
}

fun subtract(valor1: Int, valor2: Int): Int {
    return valor1 - valor2

}

fun subtractCool(valor1: Int, valor2: Int) = valor1 - valor2


fun variablesNumericas() {
    println("Rtn funcion variableNumericas")
    //int
    val ejemplo: Long = 30
    //flot
    val ejemploFloat: Float = 30.6f
    //double
    val ejemploDouble: Double = 234324.23424434
    println(ejemploDouble)

    val age: Int = 10
    var age2: Int = 10
    age2 += 5
    println("sumar")
    println(age2 + age2)
    println(age2 * age2)
    //division
    println(age2 / 2)
    // calcula el resto
    println(10 % 3)

    println(age2)
    println("convertir un float a entero")
    var xx: Int = age2 + ejemploFloat.toInt()
    println(xx)

//
}

fun variablesBoolean() {
    println("Rtn fvariablesBoolean")
    //boolean
    val ejemploBoolean: Boolean = true
    println(ejemploBoolean)
    val ejemploBoolean2: Boolean = false
    println(ejemploBoolean2)
}

fun variablesString() {
    println("Rtn fvariablesString")
    //char
    val ejemploChar: Char = 'a'
    println(ejemploChar)

    //string
    val ejemploString: String = "marcelo"
    println(ejemploString + ejemploString)
    println("hola" + ejemploString + "  xx")
    var unoString: String = "1"
    var dosString: String = "2"
    println(unoString + dosString)
    println("unoString + dosString: " + (unoString + dosString).toString())

}