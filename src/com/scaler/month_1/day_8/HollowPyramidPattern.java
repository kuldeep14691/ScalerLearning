package com.scaler.month_1.day_8;

import java.util.Scanner;

public class HollowPyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();
        int count=1;

        for (int i=input_number;i>=1;i--){
//            count=1;
//            while(count<=i){
//                System.out.print("*");
//                count++;
//            }
//            count = 1;
//            while(count<=(input_number*2-i*2)){
//                System.out.print(" ");
//                count++;
//            }
//
//            count = 1;
//            while (count<=i){
//                System.out.print("*");
//                count++;
//            }
//            System.out.println();
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int k=input_number;k<i;k--){
                System.out.print(" ");
            }
            for (int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
