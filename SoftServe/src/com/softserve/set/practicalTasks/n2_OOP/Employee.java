package com.softserve.set.practicalTasks.n2_OOP;

public class Employee {

    private String name;
    private int rate;
    private int hours;

    private static double totalSum;

    public Employee() {
        super();
    }

    public Employee(String name, int rate) {
        super();
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        super();
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += (this.rate * this.hours) + bonus();
    }

    public int salary() {
        int sal = this.rate * this.hours;
        return sal;
    }

    @Override
    public String toString() {
        return name + "'s  salary: " + salary() + " + bonus: " + bonus();
    }

    public double bonus() {
        if (hours > 15) {
            return salary() * 0.1;
        } else {

        }
        return 0;

    }

    public static void main(String[] args) {

        Employee employee = new Employee("Jack", 10, 150);
        Employee employee1 = new Employee("Helen", 10, 180);
        Employee employee2 = new Employee("Tom", 7, 175);

        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);

        System.out.println("\nTotal salary: " + totalSum);

    }
}
