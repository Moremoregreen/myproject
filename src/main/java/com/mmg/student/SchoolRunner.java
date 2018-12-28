package com.mmg.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
//        System.out.println("請輸入學生姓名");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//        System.out.println("請輸入數學成績");
//        int math = scanner.nextInt();
//        System.out.println("請輸入英文成績");
//        int english = scanner.nextInt();
        Student stu = new Student("MMG",10,99);
        stu.print();
    }
}
