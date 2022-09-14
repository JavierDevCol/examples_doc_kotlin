package com.onad.examples_doc_kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExamplesDocKotlinApplication

fun main(args: Array<String>) {
    runApplication<ExamplesDocKotlinApplication>(*args)

    val stack = GenericClass(5)
    stack.size()
    println("---------------------------")
    val generic = GenericClassVarArg("1")
    generic.push("2")
    println( generic.peek() )
    println( generic.toString())

    println("-----------Inheritance----------------")

    val estudent : Estudiante = Estudiante("Valery" , "Dibujo")
    estudent.hello()
    estudent.mat()
    estudent.hi()

}

