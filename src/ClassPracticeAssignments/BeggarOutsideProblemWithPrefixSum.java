package ClassPracticeAssignments;

import java.util.Arrays;

public class BeggarOutsideProblemWithPrefixSum {
    public static void main(String[] args) {
        int[] A = {0,0,0,0,0};
        int N = 5;//number of beggars or elements
        int Q = 3; //# of donations or query
        //donations or queries definitions
        int[][] query = {
                {1, 3},
                {0, 2},
                {4,1}
        };

        for (int i = 0; i < Q; i++) {
            int startIndex = query[i][0];
            int valueToAdd = query[i][1];
            A[startIndex] += valueToAdd;
        }

        //get prefix sum
        for (int i = 1; i < N; i++) {
            A[i] += A[i-1];

        }

        System.out.println(Arrays.toString(A));

    }
}
