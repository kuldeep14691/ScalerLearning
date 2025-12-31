package com.scaler.month_1.day_10;

import java.util.Scanner;

public class MinMaxOfArray {
    public static void main(String[] args) {
        System.out.print("Enter the length of array: ");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];

        System.out.println("Enter array element: ");
        for(int index=0;index<arrayLength;index++){
            array[index] = sc.nextInt();
        }

        System.out.print(getMax(array) + " ");
        System.out.println(getMin(array));


    }

    public static int getMax(int[] array){
        int max_value=array[0];
        for (int index=0;index<array.length;index++){
            if (array[index]>max_value){
                max_value = array[index];
            }
        }
        return max_value;
    }

    public static int getMin(int[] array){
        int min_value=array[0];
        for (int index=0;index<array.length;index++){
            if (array[index]<min_value){
                min_value = array[index];
            }
        }
        return min_value;
    }
}
