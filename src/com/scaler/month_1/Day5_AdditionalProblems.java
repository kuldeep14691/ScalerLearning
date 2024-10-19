package com.scaler.month_1;

import java.util.Scanner;

class Day5_AdditionalProblems {
    public static void main(String[] args) {
        //Q#5
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        int b = s1.nextInt();
        int c = s1.nextInt();
        int minimum = a;
        if(b<minimum) {
            minimum = b;
        }
        if (c<minimum){
            minimum = c;
        }
        System.out.println(minimum);


        //Q#4
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        switch (x){
            case 1:
                System.out.println(31);
            case 2:
                System.out.println(28);
            case 3:
                System.out.println(31);
            case 4:
                System.out.println(30);
            case 5:
                System.out.println(31);
            case 6:
                System.out.println(30);
            case 7:
                System.out.println(31);
            case 8:
                System.out.println(31);
            case 9:
                System.out.println(30);
            case 10:
                System.out.println(31);
            case 11:
                System.out.println(30);
            case 12:
                System.out.println(31);
        }


//        //Q#3
//        Scanner sc = new Scanner(System.in);
//        int rating = sc.nextInt();
//        String category = null;
//
//        if(rating>=2100){
//            category = "grand master";
//        } else if (rating>=1900) {
//            category = "candidate master";
//        } else if (rating>1600) {
//            category = "expert";
//        } else if (rating>=1400) {
//            category = "pupil";
//        } else if (rating<=1400) {
//            category = "newbie";
//        }
//
//        if(rating%2==0){
//            category = category.toUpperCase();
//        }
//        System.out.println(category);

        //Q#2
//        Scanner sc = new Scanner(System.in);
//        Integer costPrice = sc.nextInt();
//        Integer sellPrice = sc.nextInt();
//
//        if(costPrice<sellPrice){
//            System.out.println("1");
//        }else {
//            System.out.println("-1");
//        }
//
//        Integer profit=0;
//        profit = Math.abs(sellPrice-costPrice);
//        System.out.println(profit);
    }
}
