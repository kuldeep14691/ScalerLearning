package com.scaler.month_1.day_12;

public class TwoHighestElements {
    public static void main(String[] args) {
        int[] A = new int[10];
        A[0] = 17;
        A[1] = 15;
        A[2] = 8;
        A[3] = 18;
        A[4] = 6;
        A[5] = 7;
        A[6] = 20;
        A[7] = 3;
        A[8] = 20;
        A[2] = 20;

        int highest = A[0];
        int highest_index = 0;
        int second_highest = 0;

        for(int i =1; i<= A.length-1; i++){
            if(A[i] > highest){
                highest = A[i];
                highest_index = i;
            }
        }

        int[] B = A;
        B[highest_index] = 0;
        second_highest = B[0];
        for(int i=0; i<=B.length-1; i++){
             if((B[i] > second_highest) && B[i] <= highest ){
                 second_highest = B[i];
             }
        }
        System.out.println(A.length);
        System.out.println(highest);
        System.out.println(second_highest);
    }
}
