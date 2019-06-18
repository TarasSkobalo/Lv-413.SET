package com.softserve.set.hw.n5LoopsArrays.t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrganizeInt {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double number = 0;
        double average = 0;
        double counter = 0;
        double sum = 0;
        System.out.println("Enter the numbers...");
        number = Integer.parseInt(br.readLine());

        while (number >= 0) {
            counter++;
            sum += number;
            number = Integer.parseInt(br.readLine());
        }

        if (counter == 0)
            counter = 1;
            average = sum / counter;

        System.out.println("Average is : " + average);

    }

}
