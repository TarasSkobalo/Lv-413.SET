package com.softserve.set.practicalTasks.n5_LoopsArrays.task1;

public class NegNum {

    public static void main(String[] args) {


        int[] arr = {1, -10, 1, -2, 1};
        int amount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                amount++;
            }
        }
        System.out.println(amount);

//		for (int i : arr) {
//			if (i < 0) {
//				amount++;
//			}
//		}
//		System.out.println(amount);

    }
}
