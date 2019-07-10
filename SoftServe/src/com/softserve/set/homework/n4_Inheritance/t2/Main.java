package com.softserve.set.homework.n4_Inheritance.t2;

public class Main {
    public static void main(String[] args) {
        Employee[] emp = new Employee[4];

        emp[0] = new ContractEmployee("1", "Taras", "FT-1", 3200);
        emp[1] = new ContractEmployee("2", "Oleg", "FT-2", 2700);
        emp[2] = new SalariedEmployee("3", "Yurii", "SS-3", 15, 175);
        emp[3] = new SalariedEmployee("4", "Nazarii", "SS-4", 25, 160);

        bubleSortEmloyee(emp);

        for (Employee i : emp) {
            System.out.println(i + " Salary " + i.calculatePay());
        }
    }

    public static Employee[] bubleSortEmloyee(Employee arr[]) {
        Employee tmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].calculatePay() < arr[j].calculatePay()) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

}
