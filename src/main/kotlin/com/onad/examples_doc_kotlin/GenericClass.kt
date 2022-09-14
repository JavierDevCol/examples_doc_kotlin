package com.onad.examples_doc_kotlin

class GenericClass<E> (val item : E) {

    fun size() = println("${item!!::class.simpleName}")
    
}