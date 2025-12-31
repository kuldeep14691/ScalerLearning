package com.scaler.month_1.day_18;

public class IsPrime {
    public static void main(String[] args) {
        int A=10;
        int isPrime=1;
        isPrime = checkPrime(A);
//        System.out.println(isPrime);
    }
    public static int checkPrime(int A){
        int count=0;
        boolean isPrime = true;

        for (int i=2; i<=A; i++) {
            if (i==2){
                isPrime = true;
            } else {
                for (int y=2; y<i; y++){
                    if (i%y==0) isPrime = false;
                }
            }

            if (isPrime) count++;
            isPrime = true;
        }
//        System.out.println(count);
        return count;
    }
}
