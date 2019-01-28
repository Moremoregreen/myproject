package com.mmg

import java.util.*


data class TicketKotlin(val origin: Int, val destination: Int, val price: Int)

fun main(args: Array<String>) {
    var ticket = TicketKotlin(16, 48, 520)
    var test = "1234"
    println(test.validate())
    println((1..10).random())

}

fun String.validate(): Boolean = this.length >= 6

fun IntRange.random():Int{
    return Random().nextInt(endInclusive-start)+start
}