package com.mmg

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main() { //執行續與協程效率比較

    var counter = 1
//    var ms = measureTimeMillis {
//        for (i in 1..10_0000) {
//            thread {
//                counter++
//            }
//        }
//    }
    var ms = measureTimeMillis {
        for (i in 1..10_0000) {
            GlobalScope.launch {
                counter++
            }
        }
    }
    println(ms)


}