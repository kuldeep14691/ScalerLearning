package ClassPracticeAssignments;

public class MaxSubarrSumCarryForwardTechnique {
    public static void main(String[] args) {
//        int[] arr = {-8,-2,-4,-6,-7};
        int[] arr = {-8,2,4,-6,-7};
        int currentSum=0, maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length ; j++) {
                currentSum += arr[j];
                if (currentSum>maxSum){
                    maxSum=currentSum;
                }
            }
            currentSum=0;
        }
        System.out.println(maxSum);
    }
}
