package com.scaler.month_1.day_10;

import java.util.Scanner;

public class InsertThat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];
        int[] array2 = new int[arrayLength+1];

        for (int i = 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }

        int positionToBeInserted = scanner.nextInt();
        int valueToBeInserted = scanner.nextInt();

        positionToBeInserted = positionToBeInserted-1;

        for (int p=0;p<array2.length;p++){
            if (p==positionToBeInserted){
                array2[p] = valueToBeInserted;
//                p++;
            } else if (p<positionToBeInserted) {
                array2[p] = array[p];
            } else if (p>=positionToBeInserted) {
                array2[p] = array[p-1];
            }
        }

        for (int q=0;q<array2.length;q++){
            System.out.println(array2[q]);
        }
    }
}
