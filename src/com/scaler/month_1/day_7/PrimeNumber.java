package com.scaler.month_1.day_7;

import java.util.Scanner;

public class PrimeNumber {
    public static String isPrime(int number){
        for (int i=2;i<number;i++){
            if (number%i==0){
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isPrime(number));

    }
}
