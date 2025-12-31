package com.scaler.month_1.day_6;

import java.util.Scanner;

public class InvertedFullPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();


        for(int i=N; i>=1; i--){
            for (int j=1;j<=N;j++){
                if (j<=N-i){
                    System.out.print(" ");
                } else{
                    System.out.print("*-");
                }

            }
            System.out.println();

        }

    }
}
