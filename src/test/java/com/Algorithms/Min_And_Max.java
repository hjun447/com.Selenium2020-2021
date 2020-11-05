package com.Algorithms;

public class Min_And_Max {


    public static void min(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            int temp;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.print("This is the Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Its minimum(smallest) value: " + arr[0]);
    }

    public static void max(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            int temp;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Its maximum(greatest) value: " + arr[arr.length-1]);
    }
}
