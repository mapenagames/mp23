package com.twity.androidmaster.sintaxis

fun main() {
    //array
    var weekdays = arrayOf("lunes", "martes", "miercoles", "jueves", "viernes", "Sab", "dom")

    println(weekdays[0])
    println(weekdays.size)

    weekdays[1] = "MartesLindo"
    println(weekdays[1])
    veoWeek(weekdays)
    // cambie el valor del elemeno 0
    weekdays.set(0, "Lunes lluvioso")
    veoWeek(weekdays)
    var matriz = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(11,12,13,14,15,16,17),
        intArrayOf(20,21,22,23)
    )
    //recorro la matriz
    // for (x in( 0 until 2) ){
    for (i in( 0 until matriz.size) ){
        println()
        for(j in (0 until matriz[i].size)){
            println("matriz[$i][$j] = ${matriz[i][j]}")
        }
    }


    //bucle
    for (x in weekdays) {
        println("el valor es $x")
    }
    for (i in 0 .. weekdays.size -1) {
        println("Recorro weekdays por rango del for. valor: $i")
    }

    for (y in weekdays.indices) {
        println("el indice $y = " + weekdays[y] + "        << misma forma de acceder al elemento >> uso del get:"+ weekdays.get(y))

    }
    println("xxxxxxxxxxxxxxxxxxxxx")
    for ((posicion, value) in weekdays.withIndex()) {
        println("el indice $posicion =  $value")
    }
    var contador: Int = 0
    do {
        println("dia:" + weekdays[contador++])
    } while (contador < 7)

    contador = 0
    while (contador < 7) {
        println("dia2:" + weekdays[contador++])
    }

    contador = 0
    while (contador < 7) {
        println("dia3 con break:" + weekdays[contador++])
        if (contador > 3) break
    }
    veoSetCollection()
}

fun veoSetCollection() {
    //en un set collection no podes tener elementos duplicados
    //en un set collection podes tener elementos de diferentes tipos de datos.
    //en una coleccion set al ser inmutable no se puede añadir elementos

    val conjuntoSet = setOf(1,1,4,5,6,9,9,"perro")
    //los dos elementos 1 y 9 los va a calcular como si fuesen 1 porque no puede haber duplicado
    println("cantidad de elementos conjuntoSet ${conjuntoSet.size}")
    val conjuntoArray = arrayOf<Int>(1,1,4,5,6,9,9)
    println("cantidad de elementos conjuntoArray ${conjuntoArray.size}")

    if (conjuntoSet.contains("perro")) {
        println("tiene elemento con valor 'perro'")
    }
    if (conjuntoArray.contains(9))   println("tiene elemento con valor 9")

    // mutableSET  *****************
    //en una coleccion setMutable se puede añadir / remover elementos

    println(" **************mutable set **************")

    var conjuntoMutableSet: MutableSet<Int> = mutableSetOf(1,2,3,4,5,6,7,8,9)
    println("conjuntoMutableSet")
    println(conjuntoMutableSet)
    conjuntoMutableSet.add(20)
    conjuntoMutableSet.remove(4) // el remove tiene varias opciones, como un filtro para seleccionar a cual se remueve
    println(conjuntoMutableSet)
    conjuntoMutableSet.clear()  // borra todos los contenidos
    println(conjuntoMutableSet)
}
fun veoWeek(a: Array<String>) {
    for (x in a) {
        println("veoWekk - el valor es $x")
    }

}



