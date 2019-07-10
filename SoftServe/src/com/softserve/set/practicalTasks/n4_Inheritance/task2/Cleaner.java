package com.softserve.set.practicalTasks.n4_Inheritance.task2;

public class Cleaner extends Staff {

    @Override
    void salary() {
        System.out.println("cleaner salary 500000");
    }

    @Override
    void print() {
        System.out.println("I'm a cleaner!!!");
    }
}
