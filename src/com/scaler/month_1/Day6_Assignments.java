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


//        int p = sc.nextInt();
//        int count = 1;
//        while(count<=p){
//            if(count%2==0){
//                System.out.print(count + " ");
//            }
//            count++;
//        }


//        int q = sc.nextInt();
//        int count = 1;
//        int sum=0;
//        while(count<=q){
//            sum += count;
//            count++;
//        }
//        System.out.println(sum);

//        int r = sc.nextInt();
//        int count=1;
//        while (count<=r){
//            if(count%4==0){
//                System.out.print(count + " ");
//            }
//            count++;
//        }


        int s = sc.nextInt();
        int count=1;
        double sqroot=0;

        while (count<=s){
            sqroot = Math.sqrt(count);
            if((sqroot-Math.floor(sqroot))==0){
                System.out.print(count +" ");
            }
            count++;
        }
    }
}
