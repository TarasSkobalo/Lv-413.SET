package com.softserve.set.practicalTasks.n5_LoopsArrays.task1;

public class SumNum {
    public static void main(String[] args) {

        int[] arr = {7, -2, 1, -5, 6};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            {
                if (arr[i] > 0)
                    sum += arr[i];
            }
        }
        System.out.println("The sum of positive numbers in the array is: " + sum);

    }
}
