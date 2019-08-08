package com.chris.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        /*UserInput();*/
        Student stu = new Student("Chris", 99, 88);
        stu.print();
        System.out.println(stu.highest());
    }

    private static void UserInput() {
        System.out.println("Please input your name:\t");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Please input your english score:\t");
        int english = scanner.nextInt();
        System.out.println("Please input your math score:\t");
        int math = scanner.nextInt();
        Student stu = new Student(name, english, math);
        stu.print();
        System.out.println(stu.highest());
    }
}
