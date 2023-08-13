package com.curso.android.app.cursodeandroid.Sintaxis

fun main(){
    ifBasico()
    ifAnidado()
    ifBoolean()
    ifInt()
    ifMultiple()
    ifMultipleOR()
}

fun ifBasico(){
    val name = "Miguel"

    if(name == "Pepe"){
        println("Si! El nombre es Miguel")
    }else{
        println("El nombre es incorrecto")
    }
}
fun ifAnidado(){
    val animal = "auto"
    if(animal == "dog"){
        println("Esto es un perrito")
    }else if(animal == "cat"){
        println("Esto es un gatito")
    }else if(animal == "bird"){
        println("Esto es un pajarito")
    }else{
        println("Esto no es un animal de los esperados")
    }
}
fun ifBoolean(){
    var soyFeliz:Boolean = true

    //sin nada == true
    //con! == false

    if(soyFeliz){
        println("Soy Feliz!")
    }else{
        println("Soy un tipo infeliz")
    }
}
fun ifInt(){
    var age = 49

    if(age > 17){
        println("Puede beber alcohol")
    }else{
        println("Es menor, no puede beber!")
    }
}
fun ifMultiple(){
    var age = 18
    var parentPermission = false
    var esFeliz = true

    if (age >=18 && parentPermission && esFeliz){
        println("Puede beber alchol")
    }else{
        println("No puede beber")
    }

}
fun ifMultipleOR(){
    var pet = "bird"

    if(pet == "dog" || pet == "cat"){
        println("Es un gato o un perro")
    }else{
        println("No es ni perro ni gato")
    }
}

