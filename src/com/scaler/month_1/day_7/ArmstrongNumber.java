package com.scaler.month_1.day_7;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        int numberOfDigits, sumOfDigits = 0, number2=0, digit=0;

        for (Integer i=1;i<=number;i++){
            numberOfDigits = i.toString().length();
            number2 = i;

            for (int j=1;j<=numberOfDigits;j++){
                digit = number2%10;
                //sumOfDigits += Math.pow(digit,numberOfDigits);
                sumOfDigits += Math.pow(digit,3);
                number2 = number2/10;
            }

            if (sumOfDigits==i){
                System.out.println(i);
            }

            sumOfDigits=0;
            numberOfDigits=0;
        }
    }
}
