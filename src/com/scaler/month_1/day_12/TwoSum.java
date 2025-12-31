package com.scaler.month_1.day_12;

public class TwoSum {
    public static void main(String[] args) {
        int[] A = new int[10];
        int B=11;
        A[0] = 11;
        A[1] = 3;
        A[2] = 3;
        A[3] = 2;
        A[4] = 12;
        A[5] = 15;
        A[6] = 4;
        A[7] = 1;
        A[8] = 7;

        for(int i=0; i<A.length-1; i++){
            for(int j=i+1; j<A.length-1; j++){
                if(A[i] + A[j] == B){
                    System.out.println("true");
                    return;
                }

            }

        }
        System.out.println("false");
    }
}
