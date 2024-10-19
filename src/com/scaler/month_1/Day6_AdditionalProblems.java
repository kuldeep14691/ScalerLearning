package com.scaler.month_1;

import java.util.Scanner;

public class Day6_AdditionalProblems {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//
//        int count=1;
//        int evenSum=0;
//
//        while (count<=x){
//            if (count%2 == 0){
//                evenSum += count;
//            }
//            count++;
//        }
//        System.out.println(evenSum);

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int result=1;
//
//        while(b>0){
//            result *= a;
//            b--;
//        }
////        result = (int) Math.pow(a,b);
//        System.out.println(result);


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count=1;

        while(count<=10){
            System.out.println(a + " * " + count + " = " + a*count);
            count++;
        }
    }
}
