package com.onad.examples_doc_kotlin

open class Persona(
    private var name : String,
    private var apellido: String
    ) {

    fun hello() = println("Mi nombre es: $name $apellido.")

    open fun hi() = println(" un mensaje de error")
}

class Estudiante(
    name: String,
    private var materia: String
    ) :
    Persona(name = name, apellido = "Davila") {

    fun mat() = println("estoy en la materia: $materia. ")

    override fun hi() {
        println("Hola como estan todos, vamos a dibujar. ")
    }
}