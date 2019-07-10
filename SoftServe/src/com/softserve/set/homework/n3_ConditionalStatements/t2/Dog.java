package com.softserve.set.homework.n3_ConditionalStatements.t2;

import java.util.Objects;

public class Dog {

    private String name;
    private Breed breed;
    private int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return name +
                "'s breed is " + breed +
                " and he is " + age + " years old";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("James", Breed.Boxer, 5);
        Dog dog2 = new Dog("James", Breed.Beagle, 2);
        Dog dog3 = new Dog("Nick", Breed.Bulldog, 1);
        System.out.println("1. " + dog1);
        System.out.println("   " + dog2);
        System.out.println("   " + dog3 + "\n");

        if (dog1.getName() == dog2.getName() || dog1.getName() == dog3.getName() || dog2.getName() == dog3.getName()) {
            System.out.println("2. There are dogs with the same name." + "\n");
        } else {
            System.out.println("2. All dogs have a unique names" + "\n");
        }

        if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
            System.out.println("3. The oldest dog is " + dog1.getName() + ", " + dog1.getBreed() + ".");
        } else if (dog2.getAge() > dog3.getAge() && dog2.getAge() > dog1.getAge()) {
            System.out.println("3. The oldest dog is " + dog2.getName() + ", " + dog2.getBreed() + ".");
        } else {
            System.out.println("3. The oldest dog is " + dog3.getName() + ", " + dog3.getBreed() + ".");
        }

    }
}
