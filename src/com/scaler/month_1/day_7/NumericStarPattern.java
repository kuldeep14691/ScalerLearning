package com.scaler.month_1.day_7;

import java.util.Scanner;

public class NumericStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();

        for (int i =1;i<=input_number;i++){
            for (int j=1;j<=i;j++){
                if (j==i){
                    System.out.print(j);
                }else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
