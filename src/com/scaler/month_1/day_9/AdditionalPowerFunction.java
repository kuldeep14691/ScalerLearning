package com.scaler.month_1.day_9;

public class AdditionalPowerFunction {
    public static void main(String[] args) {
        final int A=5, B=3;
        System.out.println(powerFunction(A, B));
    }
    public static int powerFunction(final int A, final int B){
        int result = 1, counter=B;
        while(counter>0){
            result *= A;
            counter--;
        }
        return result;
    }
}
