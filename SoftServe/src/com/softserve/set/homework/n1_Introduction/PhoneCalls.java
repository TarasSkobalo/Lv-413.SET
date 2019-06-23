package com.softserve.set.homework.n1_Introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCalls {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Pls enter first Country");
        String n1 = br.readLine();
        System.out.println("Pls enter tariff per min");
        double c1 = Double.parseDouble(br.readLine());
        System.out.println("Pls enter count of minute");
        double t1 = Double.parseDouble(br.readLine());
        System.out.println("Call from UA to " + n1 + " will cost " + c1 * t1 + "UAH per " + t1);

        System.out.println("Pls enter second Country");
        String n2 = br.readLine();
        System.out.println("Pls enter tariff per min");
        double c2 = Double.parseDouble(br.readLine());
        System.out.println("Pls enter count of minute");
        double t2 = Double.parseDouble(br.readLine());
        System.out.println("Call from UA to " + n2 + " will cost " + c2 * t2 + "UAH per " + t2);

        System.out.println("Pls enter third Country");
        String n3 = br.readLine();
        System.out.println("Pls enter tariff per min");
        double c3 = Double.parseDouble(br.readLine());
        System.out.println("Pls enter count of minute");
        double t3 = Double.parseDouble(br.readLine());
        System.out.println("Call from UA to " + n3 + " will cost " + c3 * t3 + "UAH per " + t3);


        System.out.println("For this day you spent " + (c1 * t1 + c2 * t2 + c3 * t3) + " UAH per " + (t1 + t2 + t3) + " minutes");

    }
}
