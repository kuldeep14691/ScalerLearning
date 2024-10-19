package com.scaler.month_1;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int balance = sc.nextInt();
//        int type = sc.nextInt();
//        int amount = sc.nextInt();
//
//        if(type==1){
//            balance += amount;
//        } else if (type==2) {
//            if (amount>balance){
//                System.out.println("Insufficient Funds");
//            }
//            balance -= amount;
//        } else {
//            System.out.println("Invalid operation");
//        }
//        System.out.println(balance);

//        int num = sc.nextInt();
//        if(num%5==0 && num%11==0){
//            System.out.println(1);
//        }else {
//            System.out.println(0);
//        }

        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = Math.floorDiv(a,b);
        System.out.println(result);

    }
}
