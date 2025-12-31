package com.scaler.month_1.day_9;

import java.util.Scanner;

public class FavoriteChocolate {
    public static int Solution(int A, int B, int C){
        int numberOfChocolates=0;
        if ((A/B)>C){
            numberOfChocolates = C;
        }else {
            numberOfChocolates = A/B;
        }

        return numberOfChocolates;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A_rupees = scanner.nextInt();
        int B_cost = scanner.nextInt();
        int C_maxChocolates = scanner.nextInt();

        System.out.println(Solution(A_rupees, B_cost, C_maxChocolates));
    }
}
