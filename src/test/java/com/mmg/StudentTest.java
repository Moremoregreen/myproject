package com.mmg;

import com.mmg.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void hightestTest(){
        Student student = new Student("MMG",80,90);
        Assertions.assertEquals(90,student.hightest());
    }
    @Test
    public void averageTest(){
        Student student = new Student("MMG",80,90);
        Assertions.assertEquals((80+90)/2,student.getAverage());
    }
}
