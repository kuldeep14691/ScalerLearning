package com.scaler.month_1.day_10;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        while(numberOfTestCases>0) {
            int arrayLength = sc.nextInt();
            int[] array = new int[arrayLength];

            for (int index = 0; index < arrayLength; index++) {
                array[index] = sc.nextInt();
            }


            int integerToBeSearched = sc.nextInt();
            boolean has_found = false;

            for (int index = 0; index < arrayLength; index++) {
                if (array[index] == integerToBeSearched) {
                    has_found = true;
                }
            }
            if (has_found) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            numberOfTestCases--;
        }
    }
}
