package com.scaler.month_1.day_9;

import java.util.Scanner;

public class SumOfEvens {
    public static int solution(int A){
        int digitSum=0;
        for (int i=1;i<=A;i++){
            if (i%2==0){
                digitSum += i;
            }
        }
        return digitSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();

        System.out.println(solution(A));
    }
}
