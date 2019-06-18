package com.softserve.set.hw.n5.t1;

public class PositionNum {
    public static void main(String[] args) {

        int[] arr = {43, 102, 5, 545, 2};
        int min = arr[0];
        int indexForMin = 0;
        for (int i = 0; i < arr.length; i++) {
            int score = arr[i];
            if (score < min) {
                min = score;
                indexForMin = i;
            }
        }
        System.out.println("The min number is " + min + " on " + (indexForMin + 1) + " position");

    }
}