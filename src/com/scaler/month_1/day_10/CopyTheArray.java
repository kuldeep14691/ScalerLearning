package com.scaler.month_1.day_10;

import java.util.*;

public class CopyTheArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        A.add(0, 10);
        A.add(1, 20);
        A.add(2, 30);
        B.add(0, A.get(0) + 10);

        System.out.println("Array to string: ");
        System.out.println(A);
        System.out.println(A.toString());

        System.out.println("Array to string: ");
        System.out.println(B.toString());

        B.clear();
        System.out.println("After clearing array B: ");
        System.out.println(B.toString());

        //Using addAll
        B.addAll(A);
        System.out.println("Copying all of A's entries to B: ");
        System.out.println(B.toString());

        //using clone
        B = (ArrayList<Integer>) A.clone();
        System.out.println("Array list cloning: ");
        System.out.println(B.toString());
        System.out.println("Check if both original & cloned array list are using same memory location: ");
        System.out.println(A == B);


        System.out.println(A.size());
    }
}