package ClassPracticeAssignments;

public class MaxSubArrSumKadaneWithAllNegativeHandled {
    public static void main(String[] args) {
        int[] arr = {-2,-6,-3,-4,-8};
        int currSum=0, maxSum=0, startIndex=0, endIndex=0;

        for (int i = 0; i < arr.length; i++) {
            currSum+=arr[i];

            if (currSum>maxSum){
                maxSum = Math.max(maxSum,currSum);
                maxSum = Math.max(maxSum,arr[i]);
                endIndex=i;
            }

            if (currSum<0){
                currSum=0;
                startIndex=i+1;
            }
        }
        System.out.println(startIndex + " " + endIndex + " " + maxSum);
    }
}
