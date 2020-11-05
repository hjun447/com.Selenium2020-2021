package com.Algorithms;

public class DescendingSort {

    public static void desc(int[] arr){

        int temp;
        for(int k=0; k<arr.length; k++){
            for(int i=1; i<arr.length; i++){
                if(arr[i] > arr[i-1]){
                    temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int k=0; k<arr.length-1; k++){
                if(arr[k] > arr[k+1]){
                    int temp;
                    temp = arr[k+1];
                    arr[k+1] = arr[k];
                    arr[k] = temp; //arr[k+1]
                }
            }
        }

        for(int i=arr.length-1; i>=0; --i){
            System.out.print(arr[i] + " ");
        }


    }
}
