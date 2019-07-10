package com.softserve.set.practicalTasks.n4_Inheritance.task2;

public class Teacher extends Staff {

    @Override
    void salary() {
        System.out.println("teacher's salary 15000");
    }

    @Override
    void print() {
        System.out.println("I'm a teacher!");
    }
}
