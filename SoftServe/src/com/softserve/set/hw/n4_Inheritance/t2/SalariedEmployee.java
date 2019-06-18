package com.softserve.set.hw.n4_Inheritance.t2;

public class SalariedEmployee extends Employee implements CalcPay {

    private String socialSecurityNumber;
    private double hourlyRate;
    private double numOfHoursWorker;

    public SalariedEmployee(String employeeld, String name, String socialSecurityNumber, double hourlyRate, double numOfHoursWorker) {
        super(employeeld, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numOfHoursWorker = numOfHoursWorker;
    }

    @Override
    public double calculatePay() {
        return this.hourlyRate * this.numOfHoursWorker;
    }

    @Override
    public String toString() {
        return " ID " + getEmployeeld() + "  " + getName() + " [Social Security] " + socialSecurityNumber;
    }
}
