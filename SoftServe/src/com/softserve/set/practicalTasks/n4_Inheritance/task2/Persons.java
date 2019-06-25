package com.softserve.set.practicalTasks.n4_Inheritance.task2;

public class Persons {

    public static void main(String[] args) {

        Person[] person = new Person[6];

        person[0] = new Teacher();
        person[1] = new Teacher();
        person[2] = new Cleaner();
        person[3] = new Cleaner();
        person[4] = new Student();
        person[5] = new Student();

        for (int i = 0; i < person.length; i++) {
            person[i].print();
            if (person[i] instanceof Staff) {
                ((Staff) person[i]).salary();
            }
        }

    }
}
