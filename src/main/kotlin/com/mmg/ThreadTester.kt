package com.mmg

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main() {
    Thread({
        for (i in 1..10){
            println("Thread : ${i}")
            Thread.sleep(50)
        }
    }).start()

    thread {   //小寫 thread 不用.start  大部分都使用這種方式
        for (i in 1..10){
            println("thread() : ${i}")
            Thread.sleep(50)
        }
    }

    //協程 輕量一點的執行續(需要去gradle加lib)
    GlobalScope.launch {
        for (i in 1..10){
            println("Coroutines: ${i}")
            delay(50)
        }
    }

}