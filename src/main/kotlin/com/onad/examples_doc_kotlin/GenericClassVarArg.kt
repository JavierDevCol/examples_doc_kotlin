package com.onad.examples_doc_kotlin


// T se refiere a cualquier tipo de variable
// vararg nos permite aceptar mas de un atributo para items; (1, 2, 3) o ("uno", "dos", "tres")
// podemos crea los metodos que necesitemos en las clases genericas.
class GenericClassVarArg<T>(vararg items: T) {

    private val elements = items.toMutableList()

    fun push(element: T) = elements.add(element)

    fun peek(): T = elements.last()

    fun pop(): T = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}