package com.mmg.kotlin

import com.mmg.Human
import com.mmg.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest(){
    @Test
    fun bmiTest(){
        val human = Human("MMG",75f,1.83f)
        Assertions.assertEquals(75f/(1.83f*1.83f),human.bmi())
    }
    @Test
    fun personBmiTest(){
        val person = Person(75f,1.83f)
        Assertions.assertEquals(75f/(1.83f*1.83f),person.bmi())
    }
}