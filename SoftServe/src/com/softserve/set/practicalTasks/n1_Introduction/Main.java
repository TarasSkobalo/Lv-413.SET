package com.softserve.set.practicalTasks.n1_Introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first num ...");
        double a = Double.parseDouble(br.readLine());
        System.out.println("Enter second num ...");
        double b = Double.parseDouble(br.readLine());

        double sum = a + b;
        double min = a - b;
        double mult = a * b;
        double div = a / b;

        System.out.println("a " + " + " + " b " + " = " + sum);
        System.out.println("a " + " - " + " b " + " = " + min);
        System.out.println("a " + " * " + " b " + " = " + mult);
        System.out.println("a " + " / " + " b " + " = " + div);


    }

}
