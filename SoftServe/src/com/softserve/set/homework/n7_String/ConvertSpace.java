package com.softserve.set.homework.n7_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertSpace {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter [I am learning Java] with a few spaces between words");
        String text = br.readLine();
        System.out.println("Your entered text:\n" + text + "\n");
        System.out.println("Text after converted spaces:\n" + text.replaceAll("( )+", " "));
    }
}
