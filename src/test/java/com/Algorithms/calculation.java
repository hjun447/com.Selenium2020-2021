package com.Algorithms;

import java.util.Arrays;

public class calculation {

    public static double sum(double a, double b) {
        return (a + b);
    }

    static double subtract(double a, double b) {
        return (a + b);
    }

    static double multiply(double a, double b) {
        return (a * b);
    }

    static double divide(double a, double b) {
        return (a / b);
    }

    static boolean divisible(double a, double b) {
        return a % b == 0;
    }

    static void arrSum(double[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] += arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        double[] arr = {1,3,5};
        arrSum(arr);
    }
}
