package com.scaler.month_1.day_25;
import java.util.*;
import static java.lang.System.*;

public class ArrayCostOfRemoval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        out.println();out.println("Enter number of elements array should contain: ");
        int numberOfEntries = scanner.nextInt();
        int[] array_integer = new int[numberOfEntries];

        out.println("Enter values of elements: ");
        for (int i = 0; i < numberOfEntries; i++) {
            array_integer[i] = scanner.nextInt();
        }

        out.println("Arr defined/loaded. Size: " + array_integer.length);

        out.println("Total cost of removing all elements =" + getMinimumCost(array_integer));

    }

    public static int getMinimumCost(int[] a){
        int cost=0;

        //sort the array in ascending
        Arrays.sort(a);

        //reverse the array - to make it descending
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }

        //print revert array
        for (int i = 0; i < a.length; i++) {
            out.print(a[i] + " ");
        }
        out.println();

        for (int i = 0; i < a.length; i++) {
            cost += a[i]*(i+1);
        }

        return cost;
    }
}
