package com.scaler.month_1.day_7;

import java.util.Scanner;

public class IsPerfect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        int number=0;
        int sumOfDivisor=0;

        for (int i=0;i<numberOfTestCases;i++){
            number = scanner.nextInt();
            sumOfDivisor=0;
            for (int count=1;count<number;count++){
                if (number%count==0){
                    sumOfDivisor += count;
                }
            }
            if(sumOfDivisor==number){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
