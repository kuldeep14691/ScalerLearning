package com.scaler.month_1.day_6;

import java.util.Scanner;

public class PhotoFramePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i=1; i<=count; i++){
            for (int j =1; j<=count; j++){
                if (i==1 || i==count){
                    System.out.print("*");
                }else {
                    if (j==1 || j==count){
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
