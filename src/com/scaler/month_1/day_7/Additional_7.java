package com.scaler.month_1.day_7;

import java.util.Scanner;

public class Additional_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();

        for (int i =1;i<=input_number;i++){
            for (int j=1;j<=input_number;j++){
                if (j==1){
                    System.out.print("*");
                }
                if (j==input_number){
                    System.out.print("*");
                }

                int count = input_number-2;
                if (j>=1 && j<=count){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
