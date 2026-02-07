package com.scaler.month_1.day_31;

public class MaxSumContiguousSubarray {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,-10};
        int[] arr = {-2, -1, -3, -4, -1, -2, -1, -5, -4};
        int max_sum = Solution(arr);
        System.out.println(max_sum);
    }
    public static int Solution(int[] arr){
        int maxSoFar= Integer.MIN_VALUE,windowSum=0;

        for (int i = 0; i < arr.length; i++) {
            windowSum+=arr[i];
//            if (windowSum>maxSoFar){
//                maxSoFar=windowSum;
//            }
            maxSoFar=Math.max(windowSum, maxSoFar);

            if (windowSum<0){
                windowSum=0;
            }
        }

        return maxSoFar;
    }


}
