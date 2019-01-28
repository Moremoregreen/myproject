package com.mmg

import java.io.File

fun main(args: Array<String>) {
//    write()
    read()

}
private fun read() {
    File("outputKotlin.txt").bufferedReader().lines().forEach {
        println(it)
    }
}
private fun write() {
    //    File("outputKotlin.txt").writeText("abcKotlin")

    //使用use的話他會自動關閉
//    File("outputKotlin.txt").printWriter().use {
//        it.println("1st line")
//        it.println("2nd line")
//        it.println("3rd line")
//        it.println("4th line")
//    }

    //寫入大量資料的時候用bufferedWriter，因為其有用到系統緩衝區來寫資料，效率會高很多
    File("outputKotlin.txt").bufferedWriter().use {
        it.write("1st line\n")
        it.write("2nd line\n")
        it.write("3rd line\n")
    }
}