package com.softserve.set.hw.n2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Person {
    private String name;
    private int birthYear;
    private String anotherName;

    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public int age() {
        LocalDate localDate = LocalDate.now();
        return localDate.getYear() - birthYear;
    }

    public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Person p3 = new Person();
        System.out.println("Pls...Enter your name...");
        String name = br.readLine();
        p3.setName(name);
        System.out.println("Pls...Enter year of birth...");
        int birthYear = Integer.parseInt(br.readLine());
        p3.setBirthYear(birthYear);
        System.out.println(p3);
    }

    public void output() {
        System.out.println(name + " born in " + birthYear + " and he is " + age() + " years old");
    }

    public String changeName(String anotherName) {
        name = anotherName;
        return anotherName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnotherName() {
        return anotherName;
    }

    public void setAnotherName(String anotherName) {
        this.anotherName = anotherName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return name + " born in " + birthYear + " and he is " + age() + " years old";
    }

    public static void main(String[] args) throws IOException {
        Person person = new Person();
        person.input();
        Person person2 = new Person("Yurii", 1995);
        person2.output();
        Person person3 = new Person("Nick", 2001);
        person3.changeName("Oleg");
        System.out.println(person3);

    }

}
