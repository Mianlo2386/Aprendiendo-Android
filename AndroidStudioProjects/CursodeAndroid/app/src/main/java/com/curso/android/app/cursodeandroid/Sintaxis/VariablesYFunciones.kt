package com.curso.android.app.cursodeandroid.Sintaxis

//VARIABLES



//Int
val age:Int = 49

//Long (números muy grandes)
val example:Long = 30

//Float
val floatExample:Float = 30.5f

//String
val stringExample:String = "Aprendiendo Android con Kotlin"
val stringExample1 = "Me llamo Miguel y estoy "
val stringExample2 = "4"
val stringExample3 = "6"
//val name: String = "Miguel Lopez"

//Variables alfanumericas

//Char

val charExample1:Char = 'e'
val charExample2:Char = '5'
val charExample3:Char = '@'

fun main(){

    variablesNumericas()
    variablesBooleanas()

    variablesAlfanumericas()
    showMyName("Miguel")
    showMyAge(currentAge = 50)
    add(15,20)
    val mySubtract = subtract(20,10)
    println(mySubtract)

}

fun variablesNumericas(){
    //Variables numericas

    //Int
    val age:Int = 49
    var age2 = 50
    // println(age2)
    age2 = 51
    //println (age2)

    //Long (números muy grandes)
    val example:Long = 30

    //Float
    val floatExample:Float = 30.5f

    //Double (flotantes con mas decimales)
    val doubleExample: Double = 3254.212554

    println("Sumar:")
   println(age + age2)

   println("Restar:")
   println(age - age2)

   println("Multiplicar:")
   println(age * age2)

   println("Dividir:")
   println(age / age2)

   println("Resto:")
   println(age % age2)

}
fun variablesBooleanas(){
    //Boolean
    val booleanExample:Boolean = true
    val booleanExample2:Boolean = false
    var stringConcatenada: String = "Hola! $stringExample1 "
    println(stringConcatenada + stringExample)
}
fun variablesAlfanumericas(){

    var exampleSuma= age + floatExample
    println(exampleSuma)
    //var exampleSuma2= age + floatExample.toInt()
    //println(exampleSuma2)
    println(stringExample2 + stringExample3)
    println(stringExample2.toInt() + stringExample3.toInt())
    print("Esto es un char:")
    println(charExample3)
}
fun showMyName(name:String){
    println("Aca deberia ir mi nombre: $name")
}
fun showMyAge(currentAge:Int){
    println("Tengo casi $currentAge años")
}
fun add(firstNumber:Int, secondNumber:Int){
    print("Esta es una función que suma y el resultado es: ")
    println(firstNumber + secondNumber)
}
fun subtract(thirdNumber:Int, fourthNumber:Int):Int{
    print("Este es el retorno de la funcion que resta: ")
    return thirdNumber - fourthNumber
    //Esto se puede resumir así-->
//fun subtractCorta(firstNumber:Int, secondNumber:Int)= firstNumber - secondNumber
}
