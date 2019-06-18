package com.softserve.set.hw.n3_ConditionalStatements.t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMin {
    public void maxMin() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1-st number");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter 2-nd number");
        int b = Integer.parseInt(br.readLine());
        System.out.println("Enter 3-rd number");
        int c = Integer.parseInt(br.readLine());
        if (a > b && b > c) {
            System.out.println(a + " is the max number and " + c + " is the min number");
        } else if (a > c && c > b) {
            System.out.println(a + " is the max number and " + b + " is the min number");
        } else if (b > a && a > c) {
            System.out.println(b + " is the max number and " + c + " is the min number");
        } else if (b > c && c > a) {
            System.out.println(b + " is the max number and " + a + " is the min number");
        } else if (c > a && a > b) {
            System.out.println(c + " is the max number and " + b + " is the min number");
        } else if (c > b && b > a) {
            System.out.println(c + " is the max number and " + a + " is the min number");
        }

    }

    public static void main(String[] args) throws IOException {
        MaxMin maxMin = new MaxMin();
        maxMin.maxMin();
    }

}
