package com.softserve.set.practicalTasks.n5_LoopsArrays.task1;

public class MaxNum {
    public static void main(String[] args) {

        int[] arr = {9, -12, 55, -10, 0};

        int max = arr[0];
        int imax = 0;
        int i = 0;

        while (i < arr.length) {

            if (arr[i] > max) {
                max = arr[i];
                imax = i;
            }

            i++;
        }
        System.out.print("Maximum = " + max);
        System.out.println(" is in " + (imax + 1) + " place");
    }
}
