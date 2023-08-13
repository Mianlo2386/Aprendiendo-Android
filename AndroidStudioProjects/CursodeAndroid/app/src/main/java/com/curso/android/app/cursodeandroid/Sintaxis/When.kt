package com.curso.android.app.cursodeandroid.Sintaxis

fun main (){
    getMonth(5)
    getTrimester(1)
    println(getSemester(99))
    result(true)
}
fun result(value:Any){
    when(value){
        is Int -> println(value + value)
        is String -> println(value)
        is Boolean -> if(value)print("Es un booleano")
    }
}
fun getSemester(month: Int):String{
        return when(month){
        in 1..6 -> "Primer semestre"
        in 7..12 -> "Segundo semestre"
        !in 1..12 -> "Semestre no válido"
        else -> "Cualquier cosa"
    }
    /* SE PODRIA RESUMIR ASI LAS LINEAS 16 y 17
    * fun getSemester(month: Int) = when(month){ */
}
fun getTrimester(month: Int){
    when(month){
        1,2,3-> println("Primer trimestre")
        1,2,3-> println("Segundo trimestre")
        1,2,3-> println("Tercer trimestre")
        1,2,3-> println("Cuarto trimestre")
        else -> println("No es un trimestre valido")
    }
}
fun getMonth(month:Int){
    when(month){
        1-> println("Enero")
        2-> println("Febrero")
        3-> println("Marzo")
        4-> println("Abril")
        5-> println("Mayo")
        6-> println("Junio")
        7-> println("Julio")
        8-> println("Agosto")
        9-> println("Septiembre")
        10-> println("Octubre")
        11-> println("Noviembre")
        12-> println("Diciembre")
        else -> println("No es un mes valido")
    }
}
