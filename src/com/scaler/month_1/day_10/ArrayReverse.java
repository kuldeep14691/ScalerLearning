package com.scaler.month_1.day_10;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] int_array = new int[numberOfElements];

        for (int i=0;i<int_array.length;i++){
            int_array[i] = scanner.nextInt();
        }

        for (int j=int_array.length-1;j>=0;j--){
            System.out.print(int_array[j] + " ");
        }
    }
}
