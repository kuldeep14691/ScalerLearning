package com.scaler.month_1.day_7;

import java.util.Scanner;

public class Additional_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();

        for (int i =input_number;i>=1;i--){
            for (int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
