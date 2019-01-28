package com.mmg

import jdk.nashorn.internal.runtime.ScriptingFunctions.readLine
import java.util.*

fun main(args: Array<String>) {
    val secret = Random().nextInt(10)+1
    println(secret)
//    val scanner = Scanner(System.`in`)
    var number:Int = 0
    while (number != secret) {
        print("請輸入數字")
//        number = scanner.nextInt()
        number = readLine()!!.toInt()
        if(number>secret){
            println("小一點")
        }else if(number<secret){
            println("大一點")
        }else{
            print("猜中了!!")
        }
    }
}



