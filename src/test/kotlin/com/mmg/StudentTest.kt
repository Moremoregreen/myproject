package com.mmg.kotlin

import com.mmg.student.kotlin.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest(){
    @Test
    fun gradingTest(){
        val student = Student("MMG",100,100)
        Assertions.assertEquals('A',student.grading())
    }
    @Test
    fun averageTest(){
        val student = Student("MMG",100,100)
        Assertions.assertEquals(100,student.getAverage())
    }
    @Test
    fun passTest(){
        val student = Student("MMG",100,100)
        Assertions.assertEquals("\tPASS",student.passOrFailed())
    }
}

