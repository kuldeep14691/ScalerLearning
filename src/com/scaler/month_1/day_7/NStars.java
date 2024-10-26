package com.scaler.month_1.day_7;

import java.util.Scanner;

public class NStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();

        for (int i=0;i<number;i++){
            for (int j=0;j<number2;j++){
                System.out.print("*");
            }
            System.out.println();

        }

//        for (int i=0;i<number;i++){
//            System.out.print("*");
//        }
    }
}
