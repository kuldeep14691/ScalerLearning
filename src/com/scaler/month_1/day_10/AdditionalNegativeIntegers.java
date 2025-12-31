package com.scaler.month_1.day_10;

import java.util.Scanner;

public class AdditionalNegativeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] array = new int[numberOfElements];

        for (int i=0; i<numberOfElements; i++){
            array[i] = scanner.nextInt();
        }

        for (int i=0; i<numberOfElements; i++){
            if(array[i] < 0){
                System.out.println(array[i]);
            }
        }
    }
}
