package com.mmg

import java.util.*


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val secret = Random().nextInt(10)+1
    println(secret)

    for (i in 1..4){
        println("請輸入數字")
        var number = scanner.nextInt()
        println("第${i}次:$number")
        if (number >secret)
            println("lower")
        else if (number<secret)
            print("higher")
        else {
            println("You got it!!\t You had try ${i} times")
            break
        }
    }
}