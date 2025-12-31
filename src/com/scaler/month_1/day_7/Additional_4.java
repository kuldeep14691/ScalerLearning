package com.scaler.month_1.day_7;

import java.util.Scanner;

public class Additional_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_integer = scanner.nextInt();
        boolean is_prime = true;

        for (int i=2;i<=input_integer;i++){
            for (int j=2;j<i;j++){
                if (i%j==0){
                    is_prime = false;
                }
            }

            if(is_prime){
                System.out.println(i);
            }
            is_prime=true;
        }
    }
}
