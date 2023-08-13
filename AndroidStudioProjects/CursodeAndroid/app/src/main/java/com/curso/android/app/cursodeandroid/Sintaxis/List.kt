package com.curso.android.app.cursodeandroid.Sintaxis

fun main(){
    inmutableList()
    mutableList()
}
fun mutableList() {
    val weekDays: MutableList<String> =
        mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    weekDays.add(3, "MiguelDay")
    println(weekDays)

    if (weekDays.isEmpty()) {
        //No voy a mostrar nada porque no hay nada
    } else {
        weekDays.forEach { println(it) }
    }
    if (weekDays.isNotEmpty()) {
        weekDays.forEach {
            println(it)
        }
        weekDays.last()
    }
}
fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    //Filtrar
    val example = readOnly.filter{ it.contains("a") }
    println(example)

    //Iterar
    readOnly.forEach{ weekDay -> println(weekDay)}
}