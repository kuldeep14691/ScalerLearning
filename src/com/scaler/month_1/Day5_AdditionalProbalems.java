package com.scaler.month_1;

import java.util.Scanner;

class Day5_AdditionalProbalems {
    public static void main(String[] args) {
        //Q#2
        Scanner sc = new Scanner(System.in);
        Integer costPrice = sc.nextInt();
        Integer sellPrice = sc.nextInt();

        if(costPrice<sellPrice){
            System.out.println("1");
        }else {
            System.out.println("-1");
        }

        Integer profit=0;
        profit = Math.abs(sellPrice-costPrice);
        System.out.println(profit);
    }
}
