package com.scaler.month_1;

import java.util.Scanner;

class Day5_AdditionalProbalems {
    public static void main(String[] args) {
        //Q#3
        Scanner sc = new Scanner(System.in);
        int rating = sc.nextInt();
        String category = null;
        
        if(rating>=2100){
            category = "grand master";
        } else if (rating>=1900) {
            category = "candidate master";
        } else if (rating>1600) {
            category = "expert";
        } else if (rating>=1400) {
            category = "pupil";
        } else if (rating<=1400) {
            category = "newbie";
        }

        if(rating%2==0){
            category = category.toUpperCase();
        }
        System.out.println(category);

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
