package com.twity.mp23.sintaxis


fun main() {
    //ejercicio1
    var contador: Int = 9

    do {
        println(contador)
    } while (contador-- > 0)

    //ejercicio2
    for (contador in 1..10) {
        if ((contador % 2) == 0) println("numero par:" + contador.toString())
    }
    println()
    //ejercicio3
    var platosArray: Array<String> = arrayOf("fideos", "milanesa", "pizza", "Ravioles", "pescado")

    for (contador in platosArray) {
        println("platos de comida: $contador")
    }
    println()
    //ejercicio4


    var menu: Map<String, Int> = mapOf(
        "fideos" to 10,
        "milanesa" to 12,
        "pizza" to 13
    )
    println(menu)
    //ejercicio5

    var fideos:List<String> = listOf("harina","agua","salsa de tomate")
    var milanesa:List<String> = listOf("carne","pan rallado")
    var pizza:List<String> = listOf("harina","agua","aceite","tomate")

    var menu2: Map<String, List<String>> = mapOf(
        "Pizza" to pizza,
        "milanesa" to milanesa,
        "fideos" to fideos
        )

    println(menu2)
    for (contador in menu2) println(contador)

    //ejercicio5 otro ejemplo
    val menu3 = arrayOf(
        Triple("Sopa de verduras", 8.99, arrayOf("Zanahoria", "Apio", "Cebolla", "Calabacín")),
        Triple("Ensalada César", 10.50, arrayOf("Lechuga romana", "Pollo", "Pan tostado", "Queso parmesano", "Aderezo César")),
        Triple("Pasta Alfredo", 12.75, arrayOf("Pasta fettuccine", "Crema de leche", "Mantequilla", "Queso parmesano")),
        Triple("Filete de salmón", 15.99, arrayOf("Salmón", "Limón", "Aceite de oliva", "Sal", "Pimienta")),
        Triple("Pollo a la parrilla", 11.25, arrayOf("Pechuga de pollo", "Sal", "Pimienta", "Aceite de oliva", "Hierbas")),
        Triple("Pizza Margarita", 9.50, arrayOf("Masa de pizza", "Tomate", "Mozzarella", "Albahaca fresca"))
    )

    println("Platos ofrecidos por el restaurante:")
    for ((plato, precio, ingredientes) in menu3) {
        println("Plato: $plato - Precio: \$$precio")
        println("Ingredientes:")
        for (ingrediente in ingredientes) {
            println("- $ingrediente")
        }
        println()
    }

}

