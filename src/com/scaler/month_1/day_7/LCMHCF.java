package com.scaler.month_1.day_7;

import java.util.Scanner;

public class LCMHCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int count=1;
//        while (true){
//            count++;
//            if (count%x==0 && count%y==0){
//                break;
//            }
//        }
//        System.out.println(count);

        int hcf=0;
        while (count<=x && count<=y){
            count++;
            if (x%count==0 && y%count==0){
                hcf = count;
            }
        }
        System.out.println(hcf);
    }

}
