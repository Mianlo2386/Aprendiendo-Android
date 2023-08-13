package com.curso.android.app.cursodeandroid.Sintaxis

fun main(){
    var name:String? = null

    println(name?.get(3) ?: "Ojo! El valor es nulo. Por eso no te puedo dar esa posición que pediste con el get")
}