package com.twity.androidmaster.sintaxis

fun main() {
    //la diferencia entre listas y array que la lista se pueden agregar elementos, el array es fijo
    //una vez que se define
    /*
    Arreglo/lista : Si necesitas elementos ordenados y acceder por indice
    Set: Si el conjunto de valores que se guarda tiene que ser unico y no importa el orden
    Map: Si el conjunto de valores los acceder por Clave,Valor
     */
    mutable()
    inmutablelist()

    // mapas o diccionarios,  el concepto es que se asocia una clava a un valor
    mapas()


}

fun mapas() {
    //mapas no mutables
    println("************   mapas  **************")
    var mapa: Map<Int,String> = mapOf(
        1 to "España",
        2 to "Mexico",
        3 to "Colombia"
    )

    println(mapa)

    // mapas mutables
    var inversiones = mutableMapOf<String,Float >()
    // .put es lo mismo que .add pero en los mapas se usa .put para agregar un elemento
    inversiones.put("coca-cola",50f)
    inversiones.put("nvida",100f)
    inversiones.put("IBM",250.25f)
    println(inversiones)
    println("IBM invirtio :" + inversiones.get("IBM").toString())
  inversiones.put("IBM",11.25f)
    println(inversiones)
    println("IBM invirtio :" + inversiones.get("IBM").toString())

}

fun mutable() {
    println("lista mutable")
    var weekdays: MutableList<String> =
        mutableListOf("lunes", "martes", "miercoles", "jueves", "viernes", "Sab", "dom")
// por default el add agrega elemento al final
// weekdays.add("ArisDay")  => de esta manera agrega el elemento al final de la lista

//si se especifica un indice en el add entonces significa que el elemento lo inserta en ese indice
//y desplaza el array una posicion a partir de ese indice.


    var i: Int = 0
    var dia: String? = null
    while(i < 8){
        dia = weekdays.elementAtOrNull(i).toString()
        println("i:" + i.toString())
        println("dia:" + weekdays.elementAtOrNull(i).toString())
        println(dia)
        if (dia != "null") {
            print(" dia NO es null")
        }else {
            print(" Dia es null")
        }
        println("")

        i++
    }
    weekdays.add(2,"ArisDay")
    println(weekdays)

    //para saber si la lista tiene elementos, se pude usar isEmpty()
    if (weekdays.isEmpty()) {
        println("lista vacia")
    }else{
        println("lista completa")
    }


    if (weekdays.isNotEmpty()) {
        println("lista completa")
    }else{
        println("lista vacia")
    }
    println("antes")
    println(weekdays)
    weekdays.removeAt(1)  //remuevo el indice 1, osea martes
    println("despues")
    println(weekdays)
    println("esta vacia : " + weekdays.none().toString()) //pregunto si esta vacia
}

fun inmutablelist() {
    println("lista inmutable")
    val readOnly: List<String> =
        listOf("lunes", "martes", "miercoles", "jueves", "viernes", "Sab", "dom")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    //FILTRAR
    // en la linea siguiente, el parametro "it" va a tomar por cada iteracion el valor de la lista,
    // por ejemplo la primera vez it va a valer "lunes", la segunda "martes", etc.

    val example = readOnly.filter { it.contains("a") }
    // genere una array tomando de base readonly con un filtro
    println(example)

    println("otra forma de iterar")
    //en la instruccion foreach defino la var elemento para que guarde el valor x cada iteracion
    readOnly.forEach { elemento -> println(elemento) }
    println("-----------------------")
    //otra forma de iterar
    readOnly.forEach { println(it) }


}