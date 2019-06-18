package com.softserve.set.hw.n5LoopsArrays.t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {

    static int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    static int monthNumber(int month) {
        if ((month >= 1) && (month <= 12)) {
            return month_days[month - 1];
        } else
            return -1;

    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of month ...");
        int month = Integer.parseInt(br.readLine());

        int result = Month.monthNumber(month);
        if (month < 1 && month > 12) {
            System.out.println("Ops...Pls...Enter correct number of month");
        } else if (month == 1) {
            System.out.println("It's [ " + month + "-st ] month on the list and he includes [" + result + "] days");
        } else if (month == 2) {
            System.out.println("It's [ " + month + "-nd ] month on the list and he includes [" + result + "] days");
        } else if (month == 3) {
            System.out.println("It's [ " + month + "-rd ] month on the list and he includes [" + result + "] days");
        } else {
            System.out.println("It's [ " + month + "-th ] month on the list and he includes [" + result + "] days");
        }
    }

}


