package com.scaler.month_1.day_17;

import java.util.Scanner;

public class CountOfFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputInteger = scanner.nextInt();
        int factorCount = getCount(inputInteger);
        System.out.println(factorCount);
    }

    public static int getCount(int A){
        int factorCount = 0;

        for (int i=1; i<=A; i++){
            if (A%i == 0){
                factorCount++;
            }
        }

        return factorCount;
    }
}
