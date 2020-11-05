package com.Algorithms;

public class Main {

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 4, 3, 6};
        System.out.print("Ascending Array: ");
        AscendingSort.asc(arr);
        System.out.println();
        System.out.print("Descending Array: ");
        DescendingSort.desc(arr);
        System.out.println();
        System.out.print("Descending Array 2: ");
        DescendingSort.reverse(arr);
        System.out.println();
        System.out.println("--------------------------");
        Min_And_Max.min(arr);
        Min_And_Max.max(arr);
        System.out.println(UniqueValues.uniques("Junyoung Heo"));
        System.out.println();
        int[] arrs = {0, 0, 5, 9, 1};
        ZerosToTheEnd.zerosToTheEnd(arrs);
        System.out.println();
        FINRA.finra(20);
    }
}
