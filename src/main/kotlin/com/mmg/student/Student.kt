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
//    Student.test()
    val gstu = GraduateStudent("ABC",90,55,65)
    gstu.print()
}
class GraduateStudent(name: String?,english: Int,math: Int,var thesis:Int):Student(name,english, math){
    companion object {
        var pass = 70
    }

    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${passOrFailed()}\t${grading()}")
    }

    override fun passOrFailed(): String = if (getAverage() >= pass) "\tPASS" else "\tFAILD"
}

open class Student(var name: String?, var english: Int, var math: Int) {
    // == java的static
    companion object {
        @JvmStatic    //如果要給java程式用，加這個可以不用再多一層透過companion
        var pass = 60
        fun test() = print("test")
    }

    open fun print() {
        println("$name\t$english\t$math\t${passOrFailed()}\t${grading()}")
    }

   open fun passOrFailed() = if (getAverage() >= pass) "\tPASS" else "\tFAILD"
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