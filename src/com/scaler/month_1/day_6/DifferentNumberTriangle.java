package com.scaler.month_1.day_6;

import java.util.Scanner;

public class DifferentNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int row=count; row>=1; row--){
            int firstDigit = row;
            for (int column=1; column<=count*2-1; column++){
                int numberOfDigits = 1+(count-(row-1)-1)*2;
                int lastDigit = row + (numberOfDigits-1)*row;

                if (column<row){
                    System.out.print("x ");
                }else if (column>=row && column<=row+numberOfDigits-1) {
                    System.out.print(firstDigit + " ");
                    firstDigit += row;
                }

                if (column>row+numberOfDigits-1){
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }
}
