package com.curso.android.app.cursodeandroid.Sintaxis

fun main(){
    var name:String = "Miguel"

    val weekDays= arrayOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    print("El valor de la primera posición es: ")
    println(weekDays[0])
    print("La medida del array es: ")
    println(weekDays.size)

    if(weekDays.size >= 8){
        println(weekDays[7])
    }else{
        println("No hay mas valores")
    }
    //Modificar Valores

    weekDays[0] = "Valor de la primera posición modificado"
    //println(weekDays[0])

    //Bucles para recorrer arrays

    for(position in weekDays.indices){
        println(weekDays[position])
        println("Esta en la posición: $position")
        }
    println("Recorro el array con withIndex")
    for ((position,value) in weekDays.withIndex()){
        println("La posición $position, contiene $value")
    }
    println("Recorro el array con weekDay")
    for(weekDay in weekDays){
        println("Ahora es $weekDay")
    }

}