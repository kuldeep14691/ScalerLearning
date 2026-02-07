package com.scaler.month_1.day_31;

import java.util.Arrays;

public class ContinuousSumQuery {
    public static void main(String[] args) {
        int A = 5;
        int[][] B = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        int[] beggarPfxSum = new int[A];
        beggarPfxSum = solve(A, B);
        System.out.println(Arrays.toString(beggarPfxSum));
    }
    public static int[] solve(int A, int[][] B){
        int[] beggarMoney=new int[A];
        int left=0,right=0,donation=0;

        for (int i = 0; i < B.length; i++) {
            left=B[i][0]-1;
            right=B[i][1]-1;
            donation=B[i][2];
            beggarMoney[left]+=donation;
            if (right<beggarMoney.length-1){
                beggarMoney[right+1]-=donation;
            }
        }
//        System.out.println(Arrays.toString(beggarMoney));


        int[] beggarPfxSum = new int[A];
        beggarPfxSum[0] = beggarMoney[0];
        for (int i = 1; i < A; i++) {
            beggarPfxSum[i] = beggarPfxSum[i-1]+beggarMoney[i];
        }
//        System.out.println(Arrays.toString(beggarPfxSum));

        return beggarPfxSum;
    }
}
