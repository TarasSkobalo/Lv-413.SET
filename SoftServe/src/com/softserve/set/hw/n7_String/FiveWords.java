package com.softserve.set.hw.n7_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FiveWords {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Task1
        System.out.println("Enter sentence which will contains five words");
        String text = br.readLine();
        System.out.println("Entered sentences:\n" + text + "\n");
        String[] parts = text.split(" ");
        String longerWord = "";
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].length() >= longerWord.length()) {
                longerWord = parts[i];
            }
        }
        System.out.println("[ 1 ] The longer word in entered sentences: " + longerWord);
        //Task2
        System.out.println("[ 2 ] Number of letters in sentence: " + text.replace(" ", "").length());
        //Task3
        System.out.println("[ 3 ] Second word in reverse order: " + (parts[1] = new StringBuffer(parts[1]).reverse().toString()));

    }

}

