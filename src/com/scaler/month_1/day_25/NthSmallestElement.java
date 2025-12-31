package com.scaler.month_1.day_25;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.*;

public class NthSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.println("Enter number of elements array should contain: ");
        int numberOfEntries = scanner.nextInt();
        int[] array_integer = new int[numberOfEntries];

        out.println("Enter values of elements: ");
        for (int i = 0; i < numberOfEntries; i++) {
            array_integer[i] = scanner.nextInt();
        }

        out.println("Enter which smallest element you want to pick: ");
        int kthSmallestElement = scanner.nextInt();

        out.println("Arr defined/loaded. Size: " + array_integer.length);

        out.println("Kth smallest element is: " + kthSmallest(array_integer, kthSmallestElement));
    }

    public static int kthSmallest(final int[] A, int B){
        int kthSmallest=0;
        Arrays.sort(A);

        kthSmallest = A[B-1];

        B=kthSmallest;
        return kthSmallest;
    }
}

