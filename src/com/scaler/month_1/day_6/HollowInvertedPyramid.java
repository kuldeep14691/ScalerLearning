package com.scaler.month_1.day_6;

import java.util.Scanner;

public class HollowInvertedPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int row=N; row>=1; row--){
            for (int column=1; column<=row; column++){
                if(row==N){
                    System.out.print("*");
                }else {
                    if (column==1){
                        System.out.print("*");
                    } else if (column==row) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }
    }
}
