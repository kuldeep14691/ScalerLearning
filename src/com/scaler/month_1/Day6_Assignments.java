package com.scaler.month_1;

import java.util.Scanner;

public class Day6_Assignments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        sc.close();
//        int count=1;
//
//        while (count<=x){
//            System.out.print(count + " ");
//            count++;
//        }

//        int y = sc.nextInt();
//        int count = 1;
//        while(count<=y){
//            System.out.print(y + " ");
//            y--;
//        }

//        int z = sc.nextInt();
//        int count = 1;
//        while(count<=z){
//            if(count%2!=0){
//                System.out.print(count + " ");
//            }
//            count++;
//        }


        int p = sc.nextInt();
        int count = 1;
        while(count<=p){
            if(count%2==0){
                System.out.print(count + " ");
            }
            count++;
        }
    }
}
