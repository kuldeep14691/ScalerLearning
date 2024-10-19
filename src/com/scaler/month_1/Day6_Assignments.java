package com.scaler.month_1;

import java.util.Scanner;

public class Day6_Assignments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        int count=1;

        while (count<=x){
            System.out.print(count + " ");
            count++;
        }
    }
}
