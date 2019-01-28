package com.mmg.student;

public class Student {
    String id;
    String name;
    int math;
    int english;
    static int pass = 60;
    public Student(String name, int math, int english) {
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public Student(String id, String name, int math, int english) {
        this.id = id;
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public int hightest(){
        if (math>english)
            return math;
        else
            return english;
    }
    public void print() {
        int average = getAverage();
        System.out.print(name + "\t" + math + "\t" + english + "\t" + getAverage()+"\t" +
                ((getAverage()>=pass)?"PASS" :"FAILED"+"\t"));

        char grading = 'F';
        switch (average / 10) {
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
        }
        System.out.println(grading);
    }

    public int getAverage() {
        return (math + english) / 2;
    }
}
