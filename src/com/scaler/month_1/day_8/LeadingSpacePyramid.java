package com.scaler.month_1.day_8;

import java.util.Scanner;

public class LeadingSpacePyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();

        for (int i=input_number;i>=1;i--){
            for (int j=1;j<=input_number;j++){
                if (j>=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
