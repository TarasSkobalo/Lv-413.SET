package com.softserve.set.hw.n4.t2;

public abstract class Employee implements CalcPay{

    private String employeeld;
    private String name;


    public Employee(String employeeld, String name) {
        this.employeeld = employeeld;
        this.name = name;
    }

    public abstract double calculatePay();

    @Override
    public String toString() {
        return "Employee{" +
                "employeeld='" + employeeld + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
