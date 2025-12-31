package com.scaler.month_1.day_8;

import java.util.Scanner;

public class SkipEvenHalfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer input_number  = scanner.nextInt();

        for (int i=1;i<=input_number;i++){
            for (int j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print(" ");
                }else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
