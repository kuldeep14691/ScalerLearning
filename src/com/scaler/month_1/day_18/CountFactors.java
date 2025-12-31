package com.scaler.month_1.day_18;

public class CountFactors {
    public static void main(String[] args) {
        int A=25;

        int countOfFactors = getFactorCount(A);
        System.out.println(countOfFactors);
    }

    public static int getFactorCount(int number){
        int countOfFactors=0;
        for (int i=1;i<=number; i++){
            if (number%i==0){
                countOfFactors++;
            }
        }
        return countOfFactors;
    }
}
