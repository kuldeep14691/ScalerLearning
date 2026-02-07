package ClassPracticeAssignments;

public class MaxSubArrSumBruteForce {
    public static void main(String[] args) {
        int[] arr = {};
        int ans = arr[0], sum=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1; j <arr.length ; j++) {
                for (int k = i; k <j ; k++) {
                    sum += arr[k];
                }
                ans=Math.max(ans,sum);
                sum=0;
            }

        }
    }
}
