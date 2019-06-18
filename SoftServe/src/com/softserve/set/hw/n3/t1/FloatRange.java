package com.softserve.set.hw.n3.t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloatRange {

    public void checkRange() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1-st number");
        float a = Float.parseFloat(br.readLine());
        System.out.println("Enter 1-st number");
        float b = Float.parseFloat(br.readLine());
        System.out.println("Enter 1-st number");
        float c = Float.parseFloat(br.readLine());
        if ((-5 <= a && a <= 5) && (-5 <= b && b <= 5) && (-5 <= c && c <= 5)) {
            System.out.println("All numbers are belong to this range");
        } else {
            System.out.println("One of this numbers didn't belong to this range");
        }
    }

    public static void main(String[] args) throws IOException {
        FloatRange fr = new FloatRange();
        fr.checkRange();
    }
}
