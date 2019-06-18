package com.softserve.set.hw.n4.t2;

public class ContractEmployee extends Employee implements CalcPay {
    private String federalTaxIdmember;
    private double fixedMonthlyPayment;

    public ContractEmployee(String employeeld, String name, String federalTaxIdmember, double fixedMonthlyPayment) {
        super(employeeld, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return " ID " + getEmployeeld() + "  " + getName() +
                " [Federal Tax] " + federalTaxIdmember;
    }
}
