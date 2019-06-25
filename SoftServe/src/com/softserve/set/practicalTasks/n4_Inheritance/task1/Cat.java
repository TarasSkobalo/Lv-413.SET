package com.softserve.set.practicalTasks.n4_Inheritance.task1;

public class Cat implements Animal {

    @Override
    public void voice() {
        System.out.println("May may");
    }

    @Override
    public void feed() {
        System.out.println("Cat want to eat");
    }

}
