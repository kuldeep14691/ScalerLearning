package com.scaler.month_1;

import java.util.Scanner;

public class Day6_AdditionalProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count=1;
        int evenSum=0;

        while (count<=x){
            if (count%2 == 0){
                evenSum += count;
            }
            count++;
        }
        System.out.println(evenSum);
    }
}
