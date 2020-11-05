package com.Algorithms;

public class UniqueValues {

    public static void unique(String str) {
        //Write a return  method that can find the unique characters from the String
        //
        //Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            if (!unique.contains(str.substring(i, i + 1))) {
                unique += str.substring(i, i + 1);
            }
        }
        System.out.print("Unique values: ");
        for (int i = 0; i < unique.length(); i++) {
            System.out.print(unique.substring(i, i + 1) + "");
        }
    }

    public static String uniques(String str) {

        String[] arr = str.split("");
        String unique = "";
        for (int k = 0; k < arr.length; k++) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[k])) {
                    count++;
                }
            }
            if (count == 2) {
                unique += arr[k];

            }

        }
        return unique;
    }
}