package com.Algorithms;

public class FINRA {

    static void finra(int num) {

        String str = "";

        for (int i = 1; i < 31; i++) {
            if (num >= 1 && num < 31) {
                str = (num % 3 == 0 && num % 5 == 0) ? "FINRA" : (num % 3 == 0) ? "FIN" : (num % 5 == 0) ? "RA" : "";
            } else {
                System.out.println("Number you chose is not within the range of 1 to 30");
            }
        }
        System.out.println("Number you chose: " + num);
        System.out.println("Result: " + str);
    }
}
