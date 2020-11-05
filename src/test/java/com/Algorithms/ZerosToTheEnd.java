package com.Algorithms;

public class ZerosToTheEnd {

    public static void zerosToTheEnd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp;
            for (int k = 0; k < arr.length - 1; k++) {
                if (arr[k] < arr[k + 1]) {
                    temp = arr[k + 1];
                    arr[k + 1] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
