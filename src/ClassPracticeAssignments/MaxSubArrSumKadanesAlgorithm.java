package ClassPracticeAssignments;

public class MaxSubArrSumKadanesAlgorithm {
    public static void main(String[] args) {
        int windowSum=0, maxSum= Integer.MIN_VALUE, subarrStart=0;
        //int[] A = {-2,3,4,-1,5,-10,7};
        int[] A = {-2,-3,-4,-1,-5,-10,-7};
        for (int i = 0; i < A.length; i++) {
            //windowSum += A[i]; //this will also work but fail if all elements are negative

            windowSum = Math.max(A[i], windowSum+A[i]);

            maxSum = Math.max(windowSum, maxSum);

            if (windowSum<0){
                windowSum=0;
            }

        }
        System.out.println(maxSum);
    }
}
