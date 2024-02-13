package com.twity.androidmaster.sintaxis

fun main() {

    result(true)
    result(10)
    result("Marcelo")
    getMonth(3)
    getTrimestre(3)
    println(getTrimestre2(3))
    println(getTrimestre3(3))
    println(getTrimestre4(3))

    println(getSemestre(3))
}

//case

fun result(value: Any) {
    when (value) {
        is Int -> println(value + value)
        is String -> println(value)
        is Boolean -> if (value) println("es True")
    }

}

fun getTrimestre2(Month: Int): String {
    val result = when (Month) {
        in 1..6 -> "tre2 Primer Trimestre"
        in 7..12 -> "tre2 Segundo Trimestre"
        else -> "tre2 Semestre falso"
    }
    println("el result:" + result)
    return result
}

fun getTrimestre3(Month: Int): String {
    return when (Month) {
        in 1..6 -> "tre3 Primer Trimestre"
        in 7..12 -> "tre3 Segundo Trimestre"
        else -> "tre3 Semestre falso"
    }

}

fun getTrimestre4(Month: Int) = when (Month) {
    in 1..6 -> "tre4 Primer Trimestre"
    in 7..12 -> "tre4 Segundo Trimestre"
    else -> "tre4 Semestre falso"
}


fun getTrimestre(Month: Int) {
    when (Month) {
        in 1..6 -> println("1Primer Trimestre`")
        in 7..12 -> println("1Segundo Trimestre`")
        else -> println("1Semestre falso")
    }
//rango
    when (Month + 11) {
        in 1..6 -> println("2Primer Trimestre`")
        in 7..12 -> println("2Segundo Trimestre`")
        //en lugar de usar else se pude usar la negacion para este caso
        !in 1..12 -> println("2Semestre falso")
    }


}

fun getSemestre(Month: Int): String {
    when (Month) {
        1, 2, 3 -> return "*Primer Semestre"
        4, 5, 6 -> return "*Segundo Semestre"
        else -> return "*Trimestre falso"
    }
}


fun getMonth(month: Int) {
    when (month) {
        1 -> println("enero")
        2 -> println("febrero")
        3 -> {
            println("marzo linea 1")
            println("marzo linea2 ")
        }

        4 -> println("abril")
        5 -> println("mayo")
        6 -> println("junio")
        7 -> println("julio")
        8 -> println("agosto")
        9 -> println("septiembre")
        10 -> println("octubre")
        11 -> println("noviemre")
        12 -> println("diciembre")
        else -> println("no es valido")
    }
}