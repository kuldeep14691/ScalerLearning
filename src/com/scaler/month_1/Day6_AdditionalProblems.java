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


//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int count=1;
//
//        while(count<=10){
//            System.out.println(a + " * " + count + " = " + a*count);
//            count++;
//        }

//        long balance;
//        long numberOfOperations;
//        long count;
//
//        Scanner sc = new Scanner(System.in);
//        balance = sc.nextLong();
//        numberOfOperations = sc.nextLong();
//
//        long[] operations_type = new long[(int) numberOfOperations];    //1=credit 2=debit
//        long[] operations_amount = new long[(int) numberOfOperations];
//
//
//        for (count=0;count<numberOfOperations;count++){
//            operations_type[(int) count] = sc.nextLong();
//            operations_amount[(int) count] = sc.nextLong();
//
//            if (operations_type[(int) count] == 1){
//                balance += operations_amount[(int) count];
//                System.out.println(balance);
//            } else if (operations_type[(int) count]==2) {
//                if (operations_amount[(int) count]>balance){
//                    System.out.println("Insufficient Funds");
//                }else {
//                    balance -= operations_amount[(int) count];
//                    System.out.println(balance);
//                }
//            }
//        }
//
//        sc.close();


        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int number;
        int reverseNumber = 0;
        number = x;
        while (number>0){
            reverseNumber = reverseNumber*10 + number%10;
            number = number/10;

        }

        if (x==reverseNumber){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
