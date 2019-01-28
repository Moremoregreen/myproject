package com.mmg.student;

public class GraduateStudent extends Student {
    int thesis;
    static int pass = 70;
    public GraduateStudent(String name, int math, int english,int thesis) {
        super(name, math, english);
        this.thesis = thesis;
    }

    @Override
    public int getAverage() {
        return (math + english+thesis) / 3;
    }



    @Override
    public void print() {
        int average = getAverage();
        System.out.print(name + "\t" + math + "\t" + english +"\t"+ thesis + "\t"
                + getAverage()+"\t" +
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
}
