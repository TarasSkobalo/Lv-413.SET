package com.softserve.set.practicalTasks.n3_ConditionalStatements.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddNumb {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three numbers...");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if ((a % 2) == 0) {
            System.out.print(a + " парне ");
        } else {
            System.out.println(a + " непарне");
        }

        if ((b % 2) == 0) {
            System.out.print(b + " парне ");
        } else {
            System.out.println(a + " непарне");
        }

        if ((c % 2) == 0) {
            System.out.print(c + " парне ");
        } else {
            System.out.println(a + " непарне");
        }

    }
}
