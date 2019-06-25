package com.softserve.set.practicalTasks.n4_Inheritance.task1;

public class Animals {
    public static void main(String[] args) {

        Animal animal[] = new Animal[4];
        animal[0] = new Dog();
        animal[1] = new Dog();
        animal[2] = new Cat();
        animal[3] = new Cat();


        animal[1].voice();
        animal[0].feed();
        animal[3].voice();
        animal[2].feed();

    }
}
