package com.scaler.month_1.day_25;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.*;

public class NobleInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.println("Enter number of elements array should contain: ");
        int numberOfEntries = scanner.nextInt();
        int[] array_integer = new int[numberOfEntries];

        out.println("Enter values of elements: ");
        for (int i = 0; i < numberOfEntries; i++) {
            array_integer[i] = scanner.nextInt();
        }

        out.println("Arr defined/loaded. Size: " + array_integer.length);
        out.println("Result: " + getNobleInt(array_integer));
    }

    public static int getNobleInt(int[] A) {
        int hasNobleInt=0, countOfGreaterElems=0;
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            countOfGreaterElems = 0;
            for (int j = i+1; j < A.length ; j++) {
                if (A[i] < A[j] ){
                    countOfGreaterElems += 1;
                }
            }
            if (countOfGreaterElems == A[i]){
                hasNobleInt = 1;
                return 1;
//                break;
            }
        }
//        for (int i = 0; i < A.length; i++) {
//            // Skip duplicates
//            if (i < A.length - 1 && A[i] == A[i + 1]) continue;
//
//            // Calculate count of greater elements
//            countOfGreaterElems = A.length - 1 - i;
//
//            // Check if it's a noble integer
//            if (A[i] == A.length - 1 - i) {
//                hasNobleInt = 1;  // We found a noble integer
//            }
//        }
        return 0;
    }
}
