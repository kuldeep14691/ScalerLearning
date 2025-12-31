package com.scaler.month_1.day_8;

import java.util.Scanner;

public class FullPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer input_number = scanner.nextInt();

//        for (int i=0;i<input_number;i++){

//        }

        for (int i = 1; i <= input_number; i++) {
            for (int j = input_number; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
