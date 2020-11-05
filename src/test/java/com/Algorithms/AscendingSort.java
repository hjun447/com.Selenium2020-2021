package com.Algorithms;

public class AscendingSort {


    public static void asc(int[] arr) {

        int temp;
        for(int k=0; k<arr.length; k++) {
            for (int i = 0; i < arr.length -1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
