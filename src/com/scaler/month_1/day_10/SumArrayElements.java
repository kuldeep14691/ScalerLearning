package com.scaler.month_1.day_10;

import java.util.Scanner;

public class SumArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];

        for (int index=0;index<arrayLength;index++){
            array[index] = sc.nextInt();
        }

        System.out.println(getArraySum(array));

    }

    public static int getArraySum(int[] array){
        int sum=0;
        for (int index=0;index<array.length;index++){
            sum += array[index];
        }
        return sum;
    }
}
