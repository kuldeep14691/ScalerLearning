package ClassPracticeAssignments;

public class MaxSubArrSumKadanesAlgoWithSubArrIndex {
    public static void main(String[] args) {
        int windowSum=0, maxSum= Integer.MIN_VALUE, subArrStartIndex=0,subArrEndIndex=-1;
        int[] A = {-2,3,4,-1,5,-10,7};
        //int[] A = {-2,-3,-4,-1,-5,-10,-7};
        for (int i = 0; i < A.length; i++) {
            windowSum += A[i]; //this will also work but fail if all elements are negative
            //windowSum = Math.max(A[i], windowSum+A[i]);

            //maxSum = Math.max(windowSum, maxSum);
            if (windowSum>maxSum){
                maxSum = windowSum;
                subArrEndIndex=i;
            }

            if (windowSum<0){
                windowSum=0;
                subArrStartIndex=i+1;
                subArrEndIndex=i+1;
            }
        }
        System.out.println("MaxSub: " + maxSum + " StartIndex: " + subArrStartIndex +" EndIndex: " + subArrEndIndex);
    }
}
