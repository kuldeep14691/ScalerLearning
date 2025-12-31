package com.scaler.month_1.day_12;

public class ReverseArray {
    public static void main(String[] args) {
        int[] A = new int[4];
        for (int i=0; i< A.length; i++){
            A[i] = i;
        }

        int[] reverseArray = new int[4];
        for (int i=0; i<A.length; i++){
            reverseArray[i] = A[A.length-1-i];
        }
        System.out.println(reverseArray);
    }
}
