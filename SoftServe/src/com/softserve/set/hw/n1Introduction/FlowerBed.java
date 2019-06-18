package com.softserve.set.hw.n1Introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.PI;

public class FlowerBed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter circle radius ...");
        double radius = Double.parseDouble(br.readLine());

        double perim = 2 * PI * radius;
        double area = PI * (radius * radius);

        System.out.printf("When radius is: " + radius + " perimetr of circle is: " + "%.2f", perim);
        System.out.printf("\n"+"When radius is: " + radius + " area of circle is: " + "%.2f", area);
    }
}
