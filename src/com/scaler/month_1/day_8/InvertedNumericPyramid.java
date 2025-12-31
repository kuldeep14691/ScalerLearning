package com.scaler.month_1.day_8;

import java.util.Scanner;

public class InvertedNumericPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer input_number = scanner.nextInt();

        for (int i=input_number;i>=1;i--){
            for (int j=1;j<=i;j++){
                if(j==i){
                    System.out.print(j);
                }else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
