package com.softserve.set.practicalTasks.n4_Inheritance.task1;

public class Dog implements Animal {

    @Override
    public void voice() {
        System.out.println("Woof");
    }

    @Override
    public void feed() {
        System.out.println("Dog want to eat");
    }
}
