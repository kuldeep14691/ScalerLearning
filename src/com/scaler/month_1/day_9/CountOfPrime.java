package com.scaler.month_1.day_9;

import java.util.Scanner;

public class CountOfPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer upperRange = scanner.nextInt();

        boolean is_prime=true;
        int count=0;

        for (int i=2;i<=upperRange;i++){
            for (int j=2;j<i;j++){
                if (i%j==0){
                    is_prime = false;
                }
            }
            if (is_prime){
                count++;
            }
            is_prime = true;
        }
        System.out.println(count);
    }
}