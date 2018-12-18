package com.mmg

fun main(args: Array<String>) {
//    Human().hello()
    val h = Human()
    h.hello()
}

class Human{
    fun hello(){
        println("Hello Kotlin")
    }
}