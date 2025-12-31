package com.scaler.month_1.day_6;

public class AdditionalLeadingSpaceInvertedPyramid {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            for (int j=1; j<=5; j++){
                if (j<i){
                    System.out.print(" ");
                }else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
