package com.softserve.set.practicalTasks.n3_ConditionalStatements.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Week {

    public static void main(String[] args) throws NumberFormatException, IOException {

        DayOfWeek numberOFWeek = DayOfWeek.SUNDAY;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of week:");
        int n = Integer.parseInt(br.readLine());
        switch (n) {
            case 1:
                numberOFWeek = DayOfWeek.SUNDAY;
                break;
            case 2:
                numberOFWeek = DayOfWeek.MONDAY;
                break;
            case 3:
                numberOFWeek = DayOfWeek.TUESDAY;
                break;
            case 4:
                numberOFWeek = DayOfWeek.WEDNESDAY;
                break;
            case 5:
                numberOFWeek = DayOfWeek.THURSDAY;
                break;
            case 6:
                numberOFWeek = DayOfWeek.FRIDAY;
                break;
            case 7:
                numberOFWeek = DayOfWeek.SATURDAY;
                break;
            default:
                System.out.println("PLS Enter correct number of week's day");
                break;
        }
        if (n >= 1 && n <= 7) {
            System.out.println("en: " + numberOFWeek.getEn() + " ua: " + numberOFWeek.getUa());
        }
    }
}
