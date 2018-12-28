package com.mmg

import javafx.scene.text.FontWeight

fun main(args: Array<String>) {
//    Human().hello()
//    val h = Human(75f, 1.83f)
    val h = Human(weight = 75f,height = 1.83f)
    h.hello()
}


class Human( var name: String = "",var weight: Float, var height: Float) {
//    init {
//        println("Hello$name")
//    }

//    constructor(name: String, weight: Float, height: Float) : this(weight, height)

    fun bmi(): Float {
        return weight / (height * height)
    }

    fun hello() {
        println("Hello Kotlin")
    }
}