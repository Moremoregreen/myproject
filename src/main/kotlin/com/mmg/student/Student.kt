package com.mmg.student.kotlin

import java.util.*

fun main(args: Array<String>) {
    userInput()

}

private fun userInput() {
//    val scanner = Scanner(System.`in`)
//    println("請輸入學生姓名")
////    var name = scanner.next()
//    var name = "MMG"
//    print("請輸入英文成績")
//    var english = scanner.nextInt()
//    print("請輸入數學成績")
//    var math = scanner.nextInt()
    val stu = Student("mmg", 70, 95)
    stu.print()

}

class Student(var name: String?, var english: Int, var math: Int) {
    fun print() {
        println("$name\t$english\t$math\t${passOrFailed()}\t${grading()}")

    }

    fun passOrFailed() = if (getAverage() >= 60) "\tPASS" else "\tFAILD"
    fun nameCheck() = name?.length
    fun grading() = when (getAverage()) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    fun getAverage() = (english + math) / 2
}